package Day_5_Patterns;

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        /* Problem statement.
        Write a program to create following number series. Print first n numbers. Accept from user.
             1, 2, 5, 8, 13, 18, 25, 32
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0,b = 1, sum,count =2;
        System.out.println(" Enter your Number");
         for(int i = 1; i<=n; i++){
             sum = a+b;
             a=sum;
             count = count-1;
             if(count==0){
                 b = b+2;
                 count=2;
             }
             System.out.print(sum+"  ");
         }
    }
}