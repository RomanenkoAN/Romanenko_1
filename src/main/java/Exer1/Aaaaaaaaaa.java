package Exer1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aaaaaaaaaa {
    public static void main(String[] args) {
        String str = "Hi my name is Jin nise to meet you";
        Map<Integer, ArrayList<String>> counter = new HashMap<>();
        String[] wordList = str.split(" ");

        for(int i = 0; i < wordList.length; i++) {
            String s = wordList[i];
            Integer key = s.length();

            if(counter.containsKey(key)) {
                counter.get(key).add(s);
            } else {
                ArrayList<String> al = new ArrayList<String>();
                al.add(s);
                counter.put(key, al);
            }

        }

        /* print result */

        for(Integer key : counter.keySet()) {
            System.out.printf("%s [%s] ", key, String.join(", ", counter.get(key)));
        }

    }

}