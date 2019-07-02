import java.util.ArrayList;

public class Ex03    {
    public static void printArrayList(ArrayList<Integer> intArrayList) {
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.print(intArrayList.get(i) + " ");
        }
    }
    public static void myPrint(ArrayList<Integer> intArrayList) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < intArrayList.size(); i++) {
            s = s.append(intArrayList.get(i));
            s = s.append(" ");
        }
        System.out.println(s.toString());
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        printArrayList(myList);
        System.out.println();
        myPrint(myList);
    }
}
