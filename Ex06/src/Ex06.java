import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ex06 {
//    public static void myGetArray() {
//        String s1 = "Hello";
//        String s2 = "World";
//        String s = new String();
//        s = s.concat(s1);
//        s = s.concat(" ");
//        s = s.concat(s2);
//        System.out.println(s);
//    }
//    public static void main(String[] args) {
//        myGetArray();
//    }
    public static ArrayList<String> myGetArray(String... args) {
        ArrayList<String> myArray = new ArrayList<String>();
        for (String arg : args) {
            myArray.add(arg);
        }
        return myArray;
    }
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<String>(myGetArray("Eternal", "Sunshine", "Of", "The", "Spotless", "Mind"));
        System.out.println(myArray);
    }
}
