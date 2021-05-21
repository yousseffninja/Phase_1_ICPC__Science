import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.util.Set;

public class base {
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(new File("tttt.in"));
        PrintWriter out = new PrintWriter(new File("tttt.out"));
        Set<Character> set = new HashSet<>();
        String str1 = input.next();
        String str2 = input.next();
        String str3 = input.next();
        char[][] arr = new char[3][3];
        arr[0] = str1.toCharArray();
        arr[1] = str2.toCharArray();
        arr[2] = str3.toCharArray();
        int a = 0, b = 0;

        for(int i = 0; i < 3; i++){
            for(char c : arr[i]){
                set.add(c);
            }
        }

        for(char d : set){
            {
                if(winCol(d, arr)){
                    a++;
                }
                else if(winRow(d, arr)){
                    a++;
                }
                else if(winX(d, arr)){
                    a++;
                }
            }
            if(testCol(d, arr)){
                if(!winCol(d, arr)){
                    b++;
                    continue;
                }
            }
            else if(testRow(d, arr)){
                if(!winRow(d, arr)){
                    b++;
                    continue;
                }
            }
            else if(testX(d, arr)){
                if(!winX(d, arr)){
                    b++;
                    continue;
                }
            }
        }

        out.println(a);
        out.println(b);
        input.close();
        out.close();
    }

    public static boolean winRow(char c, char[][] arr){
        int count = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;  j++)
                if(c == arr[i][j]) count++;
            if(count == 3) return true;
            else count = 0;
        }

        return false;
    }

    public static boolean winX(char c, char[][] arr){
        if(c == arr[0][0] && c == arr[1][1] && c == arr[2][2]) return true;
        else if(c == arr[0][2] && c == arr[1][1] && c == arr[2][0]) return true;
        else return false;
    }

    public static boolean winCol(char c, char[][] arr){
        int count = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;  j++)
                if(c == arr[j][i]) count++;
            if(count == 3) return true;
            else count = 0;
        }
        return false;
    }

    public static boolean testRow(char c, char[][] arr){
        int count = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;  j++)
                if(c == arr[i][j]) count++;
            if(count == 2) return true;
            else count = 0;
        }
        return false;
    }

    public static boolean  testCol(char c, char[][] arr){
        int count = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;  j++)
                if(c == arr[j][i]) count++;
            if(count == 2) return true;
            else count = 0;
        }
        return false;
    }

    public static boolean testX(char c, char[][] arr){
        if(c == arr[0][0] && c == arr[1][1] && c != arr[2][2]) return true;
        else if(c != arr[0][0] && c == arr[1][1] && c == arr[2][2]) return true;
        else if(c == arr[0][0] && c != arr[1][1] && c == arr[2][2]) return true;
        else if(c != arr[0][2] && c == arr[1][1] && c == arr[2][0]) return true;
        else if(c == arr[0][2] && c != arr[1][1] && c == arr[2][0]) return true;
        else if(c == arr[0][2] && c == arr[1][1] && c != arr[2][0]) return true;
        else return false;
    }
}
