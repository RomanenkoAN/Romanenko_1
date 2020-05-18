package Exer1;

/*Есть целое положительное число (long).
Программа должна определить наименьшую и наибольшую цифры,
которые входят в состав данного числа.
*/

import java.util.Scanner;



public class Five {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = console.nextInt();
        int k = (n + "").length();
        System.out.println(k);

      /*  int[] w = new int[(n+ "").length()];
        for (int i = 0; i < w.length; i++) {
            w[i] = n % 10;
            n = n / 10;

            int max = w[0];
            for (int r = 1; i < w.length; r++) {
                max = Math.max(max, w[r]);
                System.out.println(max);
*/
    }
}




    /*    calculate(n);

    }

    public static void calculate(int n) {
        int a = n / 10000;
        int b = (n - a * 10000) / 1000;
        int c = (n - a * 10000 - b * 1000) / 100;
        int d = (n - a * 10000 - b * 1000 - c * 100) / 10;
        int e = (n - a * 10000 - b * 1000 - c * 100 - d * 10);


            }
     public static int min (int a,int b, int c, int d, int e)
     {

     } */





