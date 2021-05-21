import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
public class paint{
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(new File("paint.in"));
        PrintWriter out = new PrintWriter(new File("paint.out"));
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        if(a > c){
            if(a >= d){
                out.println(((d-c)+(b-a)));
            }
            else if(b >= d){
                out.println(b-c);
            }
            else{
                out.println(d-c);
            }
        }
        else{
            if(c >= b){
                out.println((b-a)+(d-c));
            }
            else if(d >= b){
                out.println(d-a);
            }
            else{
                out.println(b-a);
            }
        }
        input.close();
        out.close();
    }
}