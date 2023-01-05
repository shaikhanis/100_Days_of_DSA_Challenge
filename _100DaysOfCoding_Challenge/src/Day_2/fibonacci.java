package Day_2;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = in.nextInt();
        int a=0,b=1,c;
        System.out.print("The fibonacci Series is  ");
        System.out.println();
        for (int i=0; i<n; i++){
            c= a+b;
            a=b;
            b=c;

            System.out.print(c+" ");

        }

        // reverse fibonacci series...


        System.out.println(" ");
        System.out.print(" The revers fibonacci series is ");
        for(int i = 0; i<n; i++){
            System.out.print(b+"  ");
            c = b-a;
            b = a;
            a = c;
        }
    }
}
