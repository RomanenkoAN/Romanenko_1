/*package Ols;

import java.util.Scanner;

public class Ola1 {

Есть целое положительное число (long).
Программа должна определить наименьшую и наибольшую цифры,
которые входят в состав данного числа.

        public static void main(String[] args) {
           // long w;
            Scanner console = new Scanner(System.in);
            System.out.println("Input number: ");
            long n = console.nextLong();
            int k = (n + "").length();
            System.out.println(k);

            int[] mas_dl = new int[k];
            for (int i = 0; i < k; i++) {
                mas_dl[i] = n % 10;
                n = n / 10;

                //    while (n>0) {
                //      if (n % 10 > w)
                //        w=n%10;
                //    n=n/10;
            }
            int max = mas_dl[0];

            for (int r = 1; i < mas_dl.length; r++) {
                               max = Math.max(max, mas_dl[r]);
                System.out.println(mas_dl);

            }
        }}




      calculate(n);

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

     }

     */







