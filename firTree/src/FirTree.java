public class FirTree {
    public static void printRow(int n, int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printTrunk(int n, int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("|");
        }
        System.out.println();
    }
    public static void printTree(int size) {
        if (size != 0) {
            int top = 1;
            int rows = 4;
            int bottom = (rows - 1)*2 + top;
            int spaces = rows - 1;
            int treeWidth = size;
            if (size % 2 == 0) treeWidth--;
            for (int i = 2; i <= size; i++) {
                spaces += i + 1;
            }
            int spacesToTree = spaces;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < rows; j++) {
                    printRow(top, spaces);
                    top += 2;
                    spaces--;
                }
                top = bottom - 2;
                rows++;
                bottom = (rows - 1)*2 + top;
                spaces += 2;
            }
            spacesToTree -= treeWidth / 2;
            for (int i = 0; i < size; i++) {
                printTrunk(treeWidth, spacesToTree);
            }
        }
    }
    public static void main(String[] args) {
        printTree(5);
    }
}
