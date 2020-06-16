package Exer15;

// Create a program, that gets a path to a text file as a parameter, reads it,
// split to words, counts each word occurrence and prints it to the console, sorted ascending by words.

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GetFile
{
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream(new File("C:\\Users\\alromanenko\\Java_test\\Proba1.txt"));
        byte[] content = new byte[fis.available()];
        fis.read(content);
        fis.close();
        String lines = new String(content);

    // String input = "Sproijn gf df g sdg sdg";

        count1(lines);
        bubble(lines);
        sorted(lines);
}


       private static void count1(String input) {

           int count = 0;

           //Если хотя бы одно слово, тогда считать,- иначе конец программы
           if (input.length() != 0) {
               count++;
               //Проверка каждого символа, не пробел ли это
               for (int i = 0; i < input.length(); i++) {
                   if (input.charAt(i) == ' ') {
                       //Если пробел - увеличиваем количество слов на 1
                       count++;
                   }
               }
           }

           System.out.println("File has  " + count + " word(s)");

       }

           private static void bubble(String input){
               String[] wordArr = input.split(" ");
               boolean isSorted = false;
               String buf;
               while (!isSorted) {
                   isSorted = true;
                   for (int i = 0; i < wordArr.length - 1; i++) {
                       if (wordArr[i].length() > wordArr[i + 1].length()) {
                           isSorted = false;

                           buf = wordArr[i];
                           wordArr[i] = wordArr[i + 1];
                           wordArr[i + 1] = buf;
                       }
                   }
               }
               System.out.println(Arrays.toString(wordArr));
           }

    private static void sorted (String input) {

    Map<Integer, ArrayList<String>> counter = new HashMap<>();
    String[] wordList = input.split(" ");

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
        for(Integer key : counter.keySet()) {
    System.out.printf("%s [%s] ", key, String.join(", ", counter.get(key)));
}

}
            }
