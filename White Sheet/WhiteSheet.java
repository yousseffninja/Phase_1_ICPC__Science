import java.util.Scanner;
public class WhiteSheet {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        int x4 = input.nextInt();
        int y4 = input.nextInt();
        int x5 = input.nextInt();
        int y5 = input.nextInt();
        int x6 = input.nextInt();
        int y6 = input.nextInt();
        if((x5 <= x1 && x2 <= x6 && y5 <= y1 && y2 <= y6) || (x3 <= x1 && x2 <= x4 && y3 <= y1 && y2 <= y4)){
            System.out.println("NO");
            System.exit(0);
        }
        if((y3 <= y1 && y4 >= y2) && (y5 <= y1 && y6 >= y2)){
            if((x3 <= x1 && x6 >= x2) && (x5 <= x4)){
                System.out.println("NO");
            }
            else if((x5 <= x1 && x4 >= x2) && (x3 <= x6)){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        else if((x3 <= x1 && x4 >= x2) && (x5 <= x1 && x6 >= x2)){
            if((y3 <= y1 && y6 >= y2) && (y4 >= y5)){
                System.out.println("NO");
            }
            else if((y5 <= y1 && y4 >= y2) && (y6 >= y3)){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        else{
            System.out.println("YES");
        }
    }
}
