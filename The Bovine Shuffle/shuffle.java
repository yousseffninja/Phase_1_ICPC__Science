import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class shuffle {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("shuffle.in"));
        PrintWriter out = new PrintWriter(new File("shuffle.out"));
        int N = input.nextInt();
        int[] arr = new int[N];
        String[] vals = new String[N];
        String[] newVals = new String[N];
        for (int i = 0; i < N; i++)
            arr[i] = input.nextInt();
        for (int i = 0; i < N; i++)
            vals[i] = input.next();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < N; j++) {
                int toMove = arr[j] - 1;
                int current = j;
                newVals[current] = vals[toMove];
            }
            vals = new String[N];
            if (N >= 0)
                System.arraycopy(newVals, 0, vals, 0, N);

            newVals = new String[N];
        }
        for (String i : vals) {
            out.println(i);
        }
        input.close();
        out.close();
    }
}
