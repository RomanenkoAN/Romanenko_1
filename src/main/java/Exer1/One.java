package Exer1;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

public class One {
    public static void main (String[] args)
    {
        System.out.println("Введите X");
        Scanner scanX = new Scanner(System.in);
        float x=scanX.nextFloat();


        System.out.println("Введите Y");
        Scanner scanY = new Scanner(System.in);
        float y=scanY.nextFloat();

        System.out.println("Введите Z");
        Scanner scanZ = new Scanner(System.in);
        float z=scanZ.nextFloat();

        System.out.println("Введите N");
        Scanner scanN = new Scanner(System.in);
        float n=scanN.nextFloat();


        long rezult1;
        rezult1=(long)x + ((long)y - 100) * (long)z / (long)n;
        System.out.println("Результат в типе long равен = " + rezult1);

        int rezult2;
        rezult2=((int)x - (50 + (int)y * (int)z) * (int)n) + (int)x;
        System.out.println("Результат в типе int равен = " + rezult2);

        float rezult3;
        rezult3=x * (y / (z-1) + 555) - n;
        System.out.println("Результат в типе float равен = " + rezult3);

        double rezult4;
        rezult4=-(double)x / (double)y + (double)z * ((double)n+1);
        System.out.println("Результат в типе double равен = " + rezult4);
    }
}
