import java.util.ArrayList;

public class Ex04 {
    public static void printStringArray(ArrayList<String> stringArrayList) {
        StringBuilder s = new StringBuilder();
        int n = stringArrayList.size();
        for (int i = 0; i < n; i++) {
            s.append(stringArrayList.get(i));
            if (i == n - 1) {
                s.append("\n");
            } else {
                s.append(" ");
            }
        }
        System.out.print(s.toString());
    }
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>() {{add("What"); add("A");
                                                             add("Wonderful"); add("World");}};
        printStringArray(myList);
    }
}
