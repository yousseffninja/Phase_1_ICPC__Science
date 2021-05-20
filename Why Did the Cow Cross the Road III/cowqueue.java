import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;;

public class cowqueue {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("cowqueue.in"));
        PrintWriter out = new PrintWriter(new File("cowqueue.out"));
        int ArrSize = input.nextInt();
        int[] arr1 = new int[ArrSize];
        int[] arr2 = new int[ArrSize];
        for (int i = 0; i < ArrSize; i++) {
            arr1[i] = input.nextInt();
            arr2[i] = input.nextInt();
        }
        for (int i = 0; i < ArrSize - 1; i++)
            for (int j = 0; j < ArrSize - i - 1; j++)
                if (arr1[j] > arr1[j + 1]) {
                    int temp1 = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp1;
                    int temp2 = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp2;
                }
        int max = 0;
        for (int i = 0; i < ArrSize; i++) {
            max = Math.max(max, arr1[i]);
            max += arr2[i];
        }
        out.println(max);
        input.close();
        out.close();
    }
}
