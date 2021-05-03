import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class mixmilk {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("mixmilk.in"));
        PrintWriter out = new PrintWriter(new File("mixmilk.out"));
        ;
        int[] capacity = new int[3];
        int[] amount = new int[3];
        for (int i = 0; i < 3; i++) {
            capacity[i] = input.nextInt();
            amount[i] = input.nextInt();
        }
        for (int i = 0; i < 100; i++) {
            int i2 = amount[i % 3] + amount[(i + 1) % 3];
            if (capacity[(i + 1) % 3] >= i2) {
                amount[(i + 1) % 3] += amount[i % 3];
                amount[i % 3] = 0;
            }
            if (capacity[(i + 1) % 3] < i2) {
                int i1 = capacity[(i + 1) % 3] - amount[(i + 1) % 3];
                amount[(i + 1) % 3] += i1;
                amount[i % 3] -= i1;
            }
        }
        for (int i = 0; i < 3; i++) {
            out.println(amount[i]);
        }
        input.close();
        out.close();
    }
}
