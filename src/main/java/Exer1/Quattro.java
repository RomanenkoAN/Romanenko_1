package Exer1;
import java.util.Scanner;

/*
 ********************************
 *        Course: Java core     *
 *            Student           *
 *        Name Surname          *
 ********************************
 */

public class Quattro {

    public static void main(String[] args) {
        int length;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name and Surname: ");
        String fio = in.nextLine();
        length = fio.length();

        System.out.print("Enter position: ");
        String position = in.nextLine();

        if(length < position.length()) length = position.length();
        System.out.print("Enter your course name: ");
        String course = in.nextLine();

        if(length < course.length()) length = course.length();

        length = length+10;
        printData(fio, position, course, length);
    }

    public static void printData(String work, String group, String name, int length){
        printFrame(length);
        System.out.print("*");
        printSpaces((length - name.length())/2);
        System.out.print(name);
        printSpaces((length - name.length())/2);
        System.out.println("*");


        System.out.print("*");
        printSpaces((length - group.length())/2);
        System.out.print(group);
        printSpaces((length - group.length())/2);
        System.out.println("*");

        System.out.print("*");
        printSpaces((length - work.length())/2);
        System.out.print(work);
        printSpaces((length - work.length())/2);
        System.out.println("*");

        printFrame(length);
    }

    private static void printSpaces(int length){
        for (int i = 0; i < length; i++) {
            System.out.print(" ");
        }


    }

    private static void printFrame(int length){
        for (int i = 0; i < length+2; i++) {  // вся
            System.out.print("*");
        }
        System.out.println();
    }
}
