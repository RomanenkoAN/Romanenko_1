package Exer15;

// Create a program, that gets a path to a text file as a parameter, reads it,
// split to words, counts each word occurrence and prints it to the console, sorted ascending by words.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetFile
{
    void read(String filePath, String pattern) {
        try (Scanner scanFile = new Scanner(new File(filePath))) {
            int counter = 0;

            Pattern linePattern = Pattern.compile(pattern);

            while (scanFile.hasNextLine()) {
                String fileText = scanFile.nextLine();
                counter += 1;
                Matcher lineMatcher = linePattern.matcher(fileText.toLowerCase());
                if (lineMatcher.find()) {

                    System.out.println("Line: " + counter + ".  " + fileText);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
