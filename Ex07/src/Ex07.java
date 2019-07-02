import javax.management.RuntimeErrorException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ex07 {
    public static int lowestNumber(ArrayList<Integer> intArrayList) {
        if (intArrayList.isEmpty()) {
            throw new RuntimeException("Empty List!");
        }
        int nLow = intArrayList.get(0);
        int n = intArrayList.size();
        for (int i = 1; i < n; i++) {
            if (nLow > intArrayList.get(i)) {
                nLow = intArrayList.get(i);
            }
        }
        return nLow;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();
        Random rand = new Random();
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            intArray.add(rand.nextInt(10000) + 1);
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(intArray.get(i));
            s.append(" ");
        }
        System.out.println(s.toString());
        System.out.print("The lowest number is: ");
        System.out.println(lowestNumber(intArray));
    }
}
