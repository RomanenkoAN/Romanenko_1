package Exer15;

// Create a program, that gets a path to a text file as a parameter, reads it,
// split to words, counts each word occurrence and prints it to the console, sorted ascending by words.

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GetFile
{
    public static void main(String[] args) throws Exception {
     /*   String fileName = "C:\\Users\\alromanenko\\Java_test";
        FileReader getfile = new FileReader("Proba1.txt");  // "C:\\Users\\alromanenko\\Java_test\\Proba1.txt"
        Scanner scan = new Scanner(getfile);
        String input = String.valueOf(scan);
*/
    String input = "Sproijn gf df g sdg sdg";

        count1(input);
        sorted(input);
}


       private static void count1(String input) {

         int count = 0;

                //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
          if(input.length() != 0){
                    count++;
                    //Проверяем каждый символ, не пробел ли это
                    for (int i = 0; i < input.length(); i++) {
                        if(input.charAt(i) == ' '){
                            //Если пробел - увеличиваем количество слов на 1
                            count++;
                        }
                    }
                }

                System.out.println("File has  "+count+" words");



    }
    private static void sorted (String str) {

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
