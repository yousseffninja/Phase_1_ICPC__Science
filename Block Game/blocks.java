import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class blocks {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("blocks.in"));
        PrintWriter out = new PrintWriter(new File("blocks.out"));
        int arrSize = input.nextInt();
        int[] answer = new int[26];

        for(int i = 0; i < 26; i++)
            answer[i] = 0;

        for(int i = 0; i < arrSize; i++){
            String str1 = input.next();
            String str2 = input.next();
            int[] temp1 = new int[26];
            int[] temp2 = new int[26];
            
            for(int j = 0; j < str1.length(); j++)
                temp1[str1.charAt(j) - 'a']++;
            
            for(int k = 0; k < str2.length(); k++)
                temp2[str2.charAt(k) - 'a']++;
            
            for(int l = 0; l < 26; l++)
                answer[l] += Math.max(temp1[l], temp2[l]);
        }

        for(int i = 0; i < 26; i++)
            out.println(answer[i]);
        input.close();
        out.close();
    }
}
