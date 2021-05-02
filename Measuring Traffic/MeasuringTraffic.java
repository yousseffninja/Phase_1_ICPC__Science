import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class MeasuringTraffic {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("traffic.in"));
        PrintWriter out = new PrintWriter(new File("traffic.out"));
        int N = sc.nextInt();
        String[] ramp = new String[N];
        int[] lower = new int[N];
        int[] higher = new int[N];
        for (int i = 0; i < N; i++) {
            ramp[i] = sc.next();
            lower[i] = sc.nextInt();
            higher[i] = sc.nextInt();
        }
        int lowerBound = -99999999, upperBound = 999999999;
        for (int i = N - 1; i >= 0; i--) {
            switch (ramp[i]) {
                case "none":
                    lowerBound = Math.max(lower[i], lowerBound);
                    upperBound = Math.min(higher[i], upperBound);
                    break;
                case "on":
                    upperBound -= lower[i];
                    lowerBound -= higher[i];
                    lowerBound = Math.max(lowerBound, 0);
                    break;
                case "off":
                    upperBound += higher[i];
                    lowerBound += lower[i];
                    break;
            }
        }
        out.println(lowerBound + " " + upperBound);
        lowerBound = -99999999;
        upperBound = 999999999;
        for (int i = 0; i < N; i++) {
            switch (ramp[i]) {
                case "none":
                    lowerBound = Math.max(lower[i], lowerBound);
                    upperBound = Math.min(higher[i], upperBound);
                    break;
                case "on":
                    upperBound += higher[i];
                    lowerBound += lower[i];
                    break;
                case "off":
                    upperBound -= lower[i];
                    lowerBound -= higher[i];
                    lowerBound = Math.max(lowerBound, 0);
                    break;
            }
        }
        out.println(lowerBound + " " + upperBound);
        sc.close();
        out.close();
    }
}
