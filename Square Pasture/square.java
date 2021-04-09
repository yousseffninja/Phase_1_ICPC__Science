import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
public class square{
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(new File("square.in"));
        PrintWriter out = new PrintWriter(new File("square.out"));
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        int x4 = input.nextInt();
        int y4 = input.nextInt();
        int length1 = Math.max(Math.abs(x3-x2), Math.abs(x1-x4));
        int length2 = Math.max(Math.abs(x1-x2), Math.abs(x3-x4));
        int width1 = Math.max(Math.abs(y3-y2), Math.abs(y1-y4));
        int width2 = Math.max(Math.abs(y1-y2), Math.abs(y3-y4));
        int length = Math.max(length1, length2);
        int width = Math.max(width1, width2);
        if(length>width){
            out.println(length*length);
        }
        else{
            out.println(width*width);
        }
        input.close();
        out.close();
    }
}