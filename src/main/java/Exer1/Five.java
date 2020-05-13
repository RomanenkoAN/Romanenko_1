package Exer1;

/*Есть целое положительное число (long).
Программа должна определить наименьшую и наибольшую цифры,
которые входят в состав данного числа.
*/

public class Five {
    public static void main(String[] args) {

            long len = 173;

            double n = Math.ceil(Math.log10(len));
            System.out.println(n);
            int[] arr = new int[(int) n];
            for (int i = 0; i <= n - 1; i++) {
                arr[i] = (int) len / (int) Math.pow(10, (int) n - 1);


                System.out.println(arr[i]);


            }

        }
    }


