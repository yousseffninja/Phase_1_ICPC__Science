import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.PrintWriter;

public class citystate {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(new File("citystate.in"));
        PrintWriter out = new PrintWriter(new File("citystate.out"));

        int TC = in.nextInt();
        Map<String, Long> map = new HashMap<>();
        for(int i = 0; i < TC; i++){
            String city = in.next();
            String state = in.next();
            if(!city.substring(0, 2).equals(state)){
                String key = city.substring(0, 2) + state;
                if(!map.containsKey(key))
                    map.put(key, 0L);
                map.put(key, map.get(key) + 1);
            }
        }

       long rep = 0;
       for(String key : map.keySet()){
           String tempKey = key.substring(2) + key.substring(0,2);
           if(map.containsKey(tempKey))
            rep += map.get(key) * map.get(tempKey);
       }
        out.println(rep / 2);
        in.close();
        out.close();
    }
}
