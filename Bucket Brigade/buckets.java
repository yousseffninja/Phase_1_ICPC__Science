import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class buckets{
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(new File("buckets.in"));
        PrintWriter out = new PrintWriter(new File("buckets.out"));
        char[][] arr = new char[10][];
        for(int i=0; i<10; i++){
            arr[i] = input.next().toCharArray();
        }
        out.println(solve(arr));
        input.close();
        out.close();
    }
    public static int find(char c,char[][] arr){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(arr[i][j] == c){
                    return 10*i+j;
                }
            }
        }
        return 0;
    }
    public static int solve(char[][] arr){
        int barn = find('B', arr);
        int rock = find('R', arr);
        int lake = find('L', arr);
        int barnX = barn/10, barnY = barn%10;
		int rockX = rock/10, rockY = rock%10;
		int lakeX = lake/10, lakeY = lake%10;
        int manhattan = Math.abs(barnX-lakeX) + Math.abs(barnY-lakeY)-1;
		if (barnX == lakeX && rockX == barnX && rockY > Math.min(barnY, lakeY) && rockY < Math.max(barnY, lakeY)){
            return manhattan+2;
        }
		if (barnY == lakeY && rockY == barnY && rockX > Math.min(barnX, lakeX) && rockX < Math.max(barnX, lakeX)){
            return manhattan+2;
        }
		return manhattan;
    }
}