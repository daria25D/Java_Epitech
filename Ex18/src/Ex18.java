public class Ex18 {
    public static void main(String[] args) {
        Gecko a = new Gecko("A");
        Gecko b = new Gecko("B");
        a.fraternize(b);
        a.fraternize(b);
        Snake snake = new Snake();
        a.fraternize(snake);
        a.fraternize(b);
    }
}
