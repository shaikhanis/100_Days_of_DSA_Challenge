package Day_4;

import java.util.Scanner;

public class amstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int number = in.nextInt();
        int n1 = number;
        int length=0;

        while (n1!=0){
            n1 = n1/10;
            length++;
        }

        int n2=number;
        int sum=0;


        while (n2!=0) {

            int mul=1;
            int rem = n2%10;
            n2 = n2/10;

            rem =(int) Math.pow(rem,length);
            mul = mul*rem;

            sum+=mul;
        }
        if(sum==number){
            System.out.println("number is armstrong ");
        }else {
            System.out.println("number is not armstrong ");
        }
    }
}