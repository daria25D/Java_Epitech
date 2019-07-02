import java.util.ArrayList;

public class Ex08 {
    public static void myStringIsPresent(ArrayList<String> stringArrayList, String stringToFind) {
        if (stringArrayList.contains(stringToFind)) {
            System.out.println(stringToFind);
        } else {
            System.out.println("I don't know");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<String>(){{add("Oriane"); add("Tony"); add("Alexandra"); add("Basile");}};
        myStringIsPresent(stringArray, "Tony");
        myStringIsPresent(stringArray, "Romain");
    }
}
