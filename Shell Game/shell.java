import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class shell {
    static int[] a = new int[100];
    static int[] b = new int[100];
    static int[] c = new int[100];

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("shell.in"));
        PrintWriter out = new PrintWriter(new File("shell.out"));
        int n = input.nextInt();
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
            c[i] = input.nextInt();
        }
        for (int i = 1; i < 4; i++) {
            result = Math.max(result, ProbabiltyWin(i, n));
        }
        out.println(result);
        input.close();
        out.close();
    }

    public static int ProbabiltyWin(int point, int n) throws Exception {
        int CurrentPoint = point;
        int win = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == CurrentPoint)
                CurrentPoint = b[i];
            else if (b[i] == CurrentPoint)
                CurrentPoint = a[i];
            if (c[i] == CurrentPoint)
                win++;
        }
        return win;
    }
}
