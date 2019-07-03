import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import java.util.Random;


public class Snake extends JPanel implements Runnable {
    private final int ROWS = 60;
    private final int COLUMNS = 60;
    private final int DOT_SIZE = 10;
    private final int WALL = -1;
    private final int INITIAL_SIZE = 4;

    static final Random rand = new Random();

    private int score;
    private static int highScore = 0;
    private int Board[][] = new int[ROWS][COLUMNS];
    private List<Point> snake;
    private Point food;

    private boolean leftDir = true;
    private boolean rightDir = false;
    private boolean upDir = false;
    private boolean downDir = false;

    private volatile boolean gameOver = true;

    Thread gameThread;

    public Snake() {
        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.black);
        setFont(new Font("SansSerif", Font.BOLD, 48));
        setFocusable(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (gameOver) {
                    startNewGame();
                    repaint();
                }
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT && !rightDir) {
                    leftDir = true;
                    upDir = false;
                    downDir = false;
                }
                if (key == KeyEvent.VK_RIGHT && !leftDir) {
                    rightDir = true;
                    upDir = false;
                    downDir = false;
                }
                if (key == KeyEvent.VK_UP && !downDir) {
                    upDir = true;
                    leftDir = false;
                    rightDir = false;
                }
                if (key == KeyEvent.VK_DOWN && !upDir) {
                    downDir = true;
                    leftDir = false;
                    rightDir = false;
                }
                repaint();
            }
        });
    }

    private void startNewGame() {
        gameOver = false;
        stop();
        initBoard();
        food = new Point();
        if (score > highScore)
            highScore = score;
        score = 0;
        snake = new ArrayList<>();
        for (int i = 0; i < INITIAL_SIZE; i++) {
            snake.add(new Point(COLUMNS/2 + i, ROWS/2 + i));
        }
        addFood();
        (gameThread = new Thread(this)).start();
    }

    private void stop() {
        if (gameThread != null) {
            Thread tmp = gameThread;
            gameThread = null;
            tmp.interrupt();
        }
    }

    private void gameOver() {
        gameOver = true;
//        System.out.println("over");
        stop();
    }

    private void initBoard() {
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                if (j == 0 || j == COLUMNS - 1 ||
                    i == 0 || i == ROWS - 1)
                        Board[i][j] = WALL;
    }

    private void addFood() {
        while (true) {
            int x = rand.nextInt(ROWS - 2) + 1;
            int y = rand.nextInt(COLUMNS - 2) + 1;
            Point p = new Point(x, y);
            if (snake.contains(p) || food == p || Board[x][y] == WALL)
                continue;
            else {
                food.move(p.x, p.y);
                break;
            }
        }

    }

    private Point moveToDir(Point p) {
        Point next = new Point(p);
        if (leftDir)
            next.x--;
        if (rightDir)
            next.x++;
        if (upDir)
            next.y--;
        if (downDir)
            next.y++;
        return next;
    }

    private boolean collision() {
        Point head = snake.get(0);
        Point next = moveToDir(head);
        for (Point p: snake) {
            if ((p.x == next.x && p.y == next.y) || Board[next.x][next.y] == WALL) {
                return true;
            }
        }
        return false;
    }

    private void moveSnake() {
        for (int i = snake.size() - 1; i > 0; i--) {
            Point p1 = snake.get(i - 1);
            Point p2 = snake.get(i);
            p2.x = p1.x;
            p2.y = p1.y;
        }
        Point head = snake.get(0);
        if (leftDir)
            head.x--;
        if (rightDir)
            head.x++;
        if (upDir)
            head.y--;
        if (downDir)
            head.y++;

    }

    private boolean eatFood() {
        Point head  = snake.get(0);
        Point next = moveToDir(head);
        if (next.equals(food)) {
            return true;
        }
        return false;
    }

    private void growSnake() {
        Point tail = snake.get(snake.size() - 1);
        snake.add(new Point(moveToDir(tail)));
    }


    @Override
    public void run() {
        while (Thread.currentThread() == gameThread) {
            try {
                Thread.sleep(Math.max(75 - score, 10));
            } catch (InterruptedException e){
                return;
            }
            if (collision()) {
                gameOver();
            } else {
                if (eatFood()) {
                    score++;
                    growSnake();
                    addFood();
                }
                moveSnake();
            }
            repaint();
        }
    }

    private void drawBoard(Graphics2D g) {
        g.setColor(Color.lightGray);
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                if (Board[i][j] == WALL)
                    g.fillRect(j * DOT_SIZE, i * DOT_SIZE, DOT_SIZE, DOT_SIZE);
    }

    private void drawSnake(Graphics2D g) {
        g.setColor(Color.blue);
        Point head = snake.get(0);
        g.fillRect(head.x * DOT_SIZE, head.y * DOT_SIZE, DOT_SIZE, DOT_SIZE);
        g.setColor(Color.red);
        for (Point p: snake) {
            if (p == head) continue;
            g.fillRect(p.x * DOT_SIZE, p.y * DOT_SIZE, DOT_SIZE, DOT_SIZE);
        }
    }

    private void drawFood(Graphics2D g) {
        g.setColor(Color.green);
        g.fillRect(food.x * DOT_SIZE, food.y * DOT_SIZE, DOT_SIZE, DOT_SIZE);
    }

    private void drawStartScreen(Graphics2D g) {
        g.setColor(Color.magenta);
        g.setFont(getFont());
        g.drawString("Snake", 230, 260);
        g.setColor(Color.lightGray);
        g.setFont(getFont().deriveFont(Font.BOLD, 18));
        g.drawString("Click to start", 245, 320);
    }

    private void drawScore(Graphics2D g) {
        int h = getHeight();
        g.setFont(getFont().deriveFont(Font.BOLD, 18));
        g.setColor(getForeground());
        StringBuilder s = new StringBuilder();
        s.append("high score: ");
        s.append(highScore);
        s.append(" your score: ");
        s.append(score);
        g.drawString(s.toString(), 30, h - 30);
    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        Graphics2D g = (Graphics2D)G;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        drawBoard(g);
        if (gameOver) {
            drawStartScreen(g);
        } else {
            drawSnake(g);
            drawFood(g);
            drawScore(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("Snake");
            f.setResizable(false);
            f.add(new Snake(), BorderLayout.CENTER);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });
    }

}
