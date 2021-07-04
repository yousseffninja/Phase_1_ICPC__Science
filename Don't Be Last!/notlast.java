import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class notlast{
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(new File("notlast.in"));
        PrintWriter out = new PrintWriter(new File("notlast.out"));
        int N = in.nextInt();
        int Bessie = 0;
        int Elsie = 0;
        int Daisy = 0;
        int Gertie = 0;
        int Annabelle = 0;
        int Maggie = 0;
        int Henrietta = 0;

        for(int i = 0; i < N; i++){
            String str = in.next();
            int value = in.nextInt();
            switch(str){
                case "Bessie" : Bessie += value; break;
                case "Elsie" : Elsie += value; break;
                case "Daisy" : Daisy += value; break;
                case "Gertie" : Gertie += value; break;
                case "Annabelle" : Annabelle += value; break;
                case "Maggie" : Maggie += value; break;
                case "Henrietta" : Henrietta += value; break;
            }
        }

        String[] arrNames = {"Bessie", "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta"};
        int[] arr = {Bessie, Elsie, Daisy, Gertie, Annabelle, Maggie, Henrietta};

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6 - i; j++){
                if (arr[j] > arr[j+1]){
                    int temp1 = arr[j];
                    String temp2 = arrNames[j];
                    arr[j] = arr[j+1];
                    arrNames[j] = arrNames[j+1];
                    arr[j+1] = temp1;
                    arrNames[j+1] = temp2;
                }
            }
        }
        
        int count = 0;
        boolean flag = true;

        while(flag){
            if(count < 6){
                if(arr[count] == arr[count+1]){
                    count++;
                }
                else{
                    flag = false;
                }
            }
            else{
                flag = false;
            }
            
        }

        if(count == 6){
            out.println("Tie");
        }
        else{
            if(arr[count] == arr[count + 1]){
                out.println("Tie");
            }
            else{
                if(arr[arr.length - 1] == arr[arr.length - 2])
                    out.println("Tie");
                else
                    out.println(arrNames[count+1]);
            }
        }
        in.close();
        out.close();
    }
}