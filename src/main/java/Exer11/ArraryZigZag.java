package Exer11;

public class ArraryZigZag {

    public static void main(String args[]) {
     /*   int N = 5;
        int twoD[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            twoD[i][i] = i;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%3d",twoD[i][j]);
            System.out.println();
        }
    }    */


            int[][] matrix = new int[6][6];
            int x = 0;
            for (int i = 0; i < matrix.length; i++) {
                x++;
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = x++;
                    if (x > matrix.length) x = 1;
                }
            }
            show(matrix);
        }

        private static void show(int[][] arr) {
            for (int[] anArr : arr) {
                for (int anAnArr : anArr) {
                    System.out.print(anAnArr + " ");
                }
                System.out.println();
            }
        }
    }
