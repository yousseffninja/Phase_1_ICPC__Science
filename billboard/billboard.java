import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
public class billboard{
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(new File("billboard.in"));
        PrintWriter out = new PrintWriter(new File("billboard.out"));
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        int x4 = input.nextInt();
        int y4 = input.nextInt();
        int sumX = 0 ;
        int sumY = 0 ;
        if(x1 >= x3 && x2 <= x4 && y1 >= y3 && y2 <= y4){
            out.println(0);
        }
        else{
            if(x3 <= x2 && x3 > x1 && y3 <= y1 && y4 >= y2 && x4 >= x2){
                sumX = Math.abs(x2-x1) - Math.abs(x3-x2);
                sumY = Math.abs(y2-y1);
                out.println(sumX*sumY);
            }
            else if(x4 >= x1 && x4 < x2 && y3 <= y1 && y4 >= y2 && x3 <= x1){
                sumX = Math.abs(x2-x1) - Math.abs(x1-x4);
                sumY = Math.abs(y2-y1);
                out.println(sumX*sumY);
            }
            else if(y4 >= y2 && y3 <= y2 && y3 > y1 && x3 <= x1 && x4 >= x2){
                sumX = Math.abs(x2-x1);
                sumY = Math.abs(y2 - y1) - Math.abs(y2 - y3);
                out.println(sumX*sumY);
            }
            else if(y3 <= y1 && y4 >= y1 && y4 < y2 && x3 <= x1 && x4 >= x2){
                sumX = Math.abs(x2 - x1);
                sumY = Math.abs(y2-y1) - Math.abs(y4 - y1);
                out.println(sumX*sumY);
            }
            else{
                out.println(Math.abs(y2 - y1) * Math.abs(x2-x1));
            }
            input.close();
            out.close();
        }
    }
}