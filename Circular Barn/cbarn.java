import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class cbarn {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(new File("cbarn.in"));
        PrintWriter out = new PrintWriter(new File("cbarn.out"));
        int N = in.nextInt();
        int ans = Integer.  MAX_VALUE;
        int curr;
        int[] arr = new int[N];

        for(int i = 0; i < N; i++)
            arr[i] = in.nextInt();

        for(int i = 0; i < N; i++){
            curr = 0;
            for(int j = 0; j < N; j++){
                curr += j * arr[(i + j) % N];
            }
            ans = Math.min(ans, curr);
        }

        out.println(ans);
        in.close();
        out.close();
    }
}
