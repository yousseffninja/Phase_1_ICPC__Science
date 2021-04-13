import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
public class Teleportation {
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(new File("teleport.in"));
        PrintWriter out = new PrintWriter(new File("teleport.out"));
        int a = input.nextInt();
        int b = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int t1 = Math.abs(a-x) + Math.abs(b-y);
        int t2 = Math.abs(a-y) + Math.abs(b-x);
        out.println(Math.min(Math.min(t1, t2), Math.abs(a-b)));
        input.close();
        out.close();
    }
}
