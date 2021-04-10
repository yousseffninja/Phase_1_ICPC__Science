import java.util.Scanner;
import java.util.Set;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Kayaking {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)throws Exception{
        int arrSize = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr = fillArr(arr, arrSize*2);
        Collections.sort(arr);
        System.out.println(minInstability(arr));
    }
    public static  ArrayList<Integer> fillArr(ArrayList<Integer> arr, int arrSize){
        for(int i=0; i<arrSize; i++){
            arr.add(input.nextInt());
        }
        return arr;
    }
    public static int minInstability(ArrayList<Integer> arr){
        int ans = Integer.MAX_VALUE;
        for(int i=0;i< arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                int sum = 0;
                int sign = -1;
                for(int k=0; k<arr.size(); k++){
                    if(k == i||k == j) continue;
                    sum += sign*arr.get(k);
                    sign *=-1;
                }
                ans = Math.min(ans, sum);
            }
        }
        return ans;
    }
}
