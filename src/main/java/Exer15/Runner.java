package Exer15;
import java.util.Scanner;
public class Runner
{
    public static void main(String[] args) {

        Scanner consoleFilePath = new Scanner(System.in);
        System.out.println("Please input file path (e.g. 'C:\\Users\\alromanenko\\Java_test\\Proba1.txt'): ");
        String filePath = consoleFilePath.nextLine();

        Scanner consolePattern = new Scanner(System.in);
        System.out.println("Please input pattern which you would like to check (e.g. ([a-z]{10,10}) or 'slot'): ");
        String pattern = consolePattern.nextLine();

        GetFile fileFromConsole = new GetFile();
        fileFromConsole.read(filePath, pattern.toLowerCase());
    }
}