package Exer6;

// From the beginning, the only developer in the company was its founder.
// Each next developer, who joins the company, had one interview with each developer
// who works in the company at the given moment.
//Given a current number of the developer in the company (provided as a parameter by user), calculate,
// how many interviews have been conducted inside a
// company.

// an   =   a1   +   d  (n−1) ,
// Sn   =   (a1+an)⋅n/2


import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        System.out.println("Input number of developer  : ");
        Scanner developer = new Scanner(System.in);
        int n=developer.nextInt();
        int sum = (n-1)*n/2;

        System.out.println(sum);
        System.out.println();

        howMany(n);

        System.out.println();
        System.out.println(howMany2(n));

    }

    public static void howMany (int n) {

        int out = --n;
        if (out == 0) return ;
        System.out.println(out);
                howMany(out);

    }
    public static int howMany2 (int n) {

        int out = --n;
        if (out==0) return out;
        int rez = out + howMany2(out);
       return rez;



    }

}
