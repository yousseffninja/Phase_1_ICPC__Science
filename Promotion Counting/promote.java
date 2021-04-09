import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class promote {
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(new File("promote.in"));
        PrintWriter out = new PrintWriter(new File("promote.out"));
        int BronzeBefore = input.nextInt();
        int BronzeAfter = input.nextInt();
        int SilverBefore = input.nextInt();
        int SilverAfter = input.nextInt();
        int GoldBefore = input.nextInt();
        int GoldAfter = input.nextInt();
        int PlatBefore = input.nextInt();
        int PlatAfter = input.nextInt();
        int BronzeToSilver = SilverAfter - SilverBefore + GoldAfter - GoldBefore + PlatAfter - PlatBefore ;
        int SilverToGold = GoldAfter - GoldBefore + PlatAfter - PlatBefore ;
        int GoldToPlat = PlatAfter - PlatBefore ;
        out.println(BronzeToSilver);
        out.println(SilverToGold);
        out.println(GoldToPlat);
        input.close();
        out.close();
    }
}