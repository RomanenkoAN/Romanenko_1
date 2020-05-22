package Exer1;

// The user enters the string.
// The program should split the string by words,
// turn each word "upside-down", make a new string and print it to the console.

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input your phrase : ");
        String chars = console.nextLine();

        upsideDown(chars);
    }

    private static void upsideDown(String chars) {

        String[] splittedChars = chars.split(" ");

        for (int i = 0; i < splittedChars.length; i++) {
            StringBuilder str = new StringBuilder(splittedChars[i]);
            String result = str.reverse().toString();

            System.out.print(result);

            if (i < (splittedChars.length) - 1) {
                System.out.print(" ");
            }
        }
    }
}
