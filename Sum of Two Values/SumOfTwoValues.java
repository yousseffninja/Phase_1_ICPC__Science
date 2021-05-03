import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SumOfTwoValues {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        int x = input.nextInt();
        int[] tem = new int[n];
        HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            tem[i] = input.nextInt();
            arr.put(tem[i], i + 1);
        }
        for (int i = 0; i < n; i++) {
            int temp = x - tem[i];
            if (arr.containsValue(temp) && arr.get(temp) != i + 1) {
                System.out.println((i + 1) + " " + arr.get(temp));
                System.exit(0);
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
