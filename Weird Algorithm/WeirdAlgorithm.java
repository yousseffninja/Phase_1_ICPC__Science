import java.util.Scanner;
import java.util.ArrayList;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextInt();
        System.out.print(N + " ");
        while(N > 1){
            if(N % 2 == 0){
                N /= 2 ;
                System.out.print(N + " ");
            }
            else{
                N = N*3 + 1;
                System.out.print(N + " ");
            }
        }
    }
}
