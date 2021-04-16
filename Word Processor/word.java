import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class word {
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(new File("word.in"));
        PrintWriter output = new PrintWriter(new File("word.out"));
        int arrSize = input.nextInt();
        int width = input.nextInt();
        String[] arr = new String[arrSize];
        for(int i=0 ; i<arrSize; i++){
            arr[i] = input.next();
        }
        int index = 0;
		while (index < arrSize) {
			output.print(arr[index]);
			int pos = arr[index].length();
			index++;
			while (index<arrSize && pos+arr[index].length() <= width) {
				output.print(" "+arr[index]);
				pos += arr[index].length();
				index++;
			}
			output.println();
		}
        input.close();
        output.close();
    }
}
