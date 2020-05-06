package Exer1;

import java.util.Scanner;

public class Tre {
    public static void main (String[] args)
    {
        System.out.println("Введите координату X");
        Scanner corX = new Scanner(System.in);
        int x=corX.nextInt();

        System.out.println("Введите координату Y");
        Scanner corY = new Scanner(System.in);
        int y=corX.nextInt();

        System.out.println("Введите координату Z");
        Scanner corZ = new Scanner(System.in);
        int z=corX.nextInt();

        double distance;
        distance=Math.sqrt(x*x+y*y+z*z);
        System.out.println(distance);

    }
}
