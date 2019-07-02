public class Ex02 {
    public static String getAngryDog(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            if (i != n - 1)
                s = s.concat("woof ");
            else
                s = s.concat("woof");
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(getAngryDog(5));
    }
}
