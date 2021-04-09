import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class speeding{
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(new File("speeding.in"));
        PrintWriter out = new PrintWriter(new File("speeding.out"));
        int[] SpeedLimit = new int[100];
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int[] travil1 = new int[n1];
        int[] speed1 = new int[n1];
        int[] travil2 = new int[n2];
        int[] speed2 = new int[n2];
        int[] travelLimit1 = new int[100];
        int[] travelLimit2 = new int[100];
        for(int i=0; i<n1;i++){
            travil1[i] = input.nextInt();
            speed1[i] = input.nextInt();
        }
        for(int i=0; i<n2; i++){
            travil2[i] = input.nextInt();
            speed2[i] = input.nextInt();
        }
        int counter = 0;
        for(int i=0;i<n1; i++){
            for(int j=0; j<travil1[i]; j++){
                travelLimit1[counter++] = speed1[i];
            }
        }
        counter = 0;
        for(int i=0;i<n2; i++){
            for(int j=0; j<travil2[i]; j++){
                travelLimit2[counter++] = speed2[i];
            }
        }
        int temp = 0;
        for(int i=0; i<100; i++){
            int solve = travelLimit2[i] - travelLimit1[i];
            temp = Math.max(temp, solve);
        }
        out.println(temp);
        input.close();
        out.close();
    }
}