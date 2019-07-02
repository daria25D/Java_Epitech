public class Ex05 {
    public static void printMovieFromNmbr(int num) {
        switch (num){
            case 3:
                System.out.println("The Three Brothers");
                break;
            case 6:
                System.out.println("The Sixth Sense");
                break;
            case 23:
                System.out.println("The Number 23");
                break;
            case 28:
                System.out.println("28 Days Later");
                break;
//            case 42:
//                System.out.println("The Answer To Life, The Universe And Everything!");
//                break;
            default:
                System.out.println("I don't know");
        }
    }
    public static void main(String[] args) {
        printMovieFromNmbr(3);
        printMovieFromNmbr(6);
        printMovieFromNmbr(23);
        printMovieFromNmbr(28);
        printMovieFromNmbr(42);
        printMovieFromNmbr(19);
    }
}
