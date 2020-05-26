package Exer1;

// The user provides the length of the array as an input parameter. The program should create an array of that length,
// fill it with random numbers and print an array and all numbers divided by 3 to the console.
// ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Nine{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int arraySize = console.nextInt();

        printArray(arraySize);
    }

    public static void printArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10000);
            System.out.println(array[i]);
        }
        System.out.println( "all numbers divided by 3");
        for (int j = 0; j < arraySize; j++) {
            if (array[j] % 3 == 0) {
                System.out.println(array[j]);
            }
        }
    }
}