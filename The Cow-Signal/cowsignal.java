import java.io.*;
import java.util.*;
public class cowsignal{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new File("cowsignal.in"));
        int arrRowSize = input.nextInt();
        int arrColSize = input.nextInt();
        int Repetition = input.nextInt();
        char[][] Symbol = new char[arrRowSize][];
        for(int i=0; i<arrRowSize; i++){
            Symbol[i] = input.next().toCharArray();
        }
        char[][] solve = SymRepetation(Symbol, arrRowSize, arrColSize, Repetition);
        PrintWriter out = new PrintWriter(new File("cowsignal.out"));
        for(int i=0; i<arrRowSize*Repetition; i++){
            out.println(new String(solve[i]));
        }
        out.close();
        input.close();
    }
    public static char[][] SymRepetation(char[][] symbol, int arrRowSize, int arrColSize, int Repatation){
        char[][] arr = new char[arrRowSize*Repatation][arrColSize*Repatation];
        for(int i=0; i<arrRowSize*Repatation; i+=Repatation){
            for(int j=0; j<arrColSize*Repatation; j+=Repatation){
                for(int k=0; k<Repatation; k++){
                    for(int l=0; l<Repatation; l++){
                        arr[i+k][j+l] = symbol[i/Repatation][j/Repatation]; 
                    }
                }
            }
        }
        return arr;
    }
}