package Day_2;

import java.util.Scanner;

//Write a program to create following number series. Print first n numbers. Acceptn from user.
//1, 2, 5, 8, 13, 18, 25, 32....
public class special_Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = in.nextInt();
        sum(n);
    }
    static void sum (int n){
        int a=0, b=1, c=0, count=2;
        for (int i=1; i<=n; i++){
            c= a+b;
            a = c;
            count = count-1;
            if(count == 0){
                b= b+2;
                count =2;
            }
            System.out.println(c+" ");
        }
    }
}
