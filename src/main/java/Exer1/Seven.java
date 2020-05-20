package Exer1;
import java.util.Scanner;

// The user provides the sequence of symbols as a parameter to the program.
// Calculate if this sequence is a palindrome. Print YES or NO
// as an answer for the calculations.

public class Seven {
    public static void main(String[] args) {
        Scanner stroka = new Scanner(System.in);
        System.out.println("Input word: ");
        String phrase = stroka.nextLine();

        System.out.println(isPalindrome(phrase));
    }

        private static boolean isPalindrome (String str)
    {
            if (str == null)
                return false;

            int length = str.length();
            System.out.println(length / 2);

            for (int i = 0; i < length / 2; i++) {

                if (str.charAt(i) != str.charAt(length - i - 1))
                    return false;
            }
            return true;
        }

    }
