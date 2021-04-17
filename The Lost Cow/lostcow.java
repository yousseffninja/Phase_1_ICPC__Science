import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
public class lostcow {
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(new File("lostcow.in"));
        PrintWriter out = new PrintWriter(new File("lostcow.out"));
        int x = input.nextInt();
        int y = input.nextInt();
        int directory = 1;
        int solution = 0;
        int pos = x;
        int newPos = x;
        int multiply = 1;
        while(true){
            if((directory == 1 && x + multiply >= y && y >= x) || (directory == -1 && x - multiply <= y && y <= x)){
                solution += Math.abs(y-pos);
                out.println(solution);
                break;
            }
            else{
                if(directory == -1){
                    newPos = x - multiply;
                }
                else{
                    newPos = x + multiply;
                }
                solution += Math.abs(pos - newPos);
                pos = newPos;
                multiply *=2;
                directory *=-1;
            }
        }
        input.close();
        out.close();
    }
}
