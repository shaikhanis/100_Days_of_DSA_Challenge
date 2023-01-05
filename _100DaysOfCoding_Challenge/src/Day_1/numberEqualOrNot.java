package Day_1;

import java.util.Scanner;
// Write a program to find the two numbers equal or not.
public class numberEqualOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1= in.nextInt();
        System.out.println("Enter Number 2");
        int num2= in.nextInt();
        if (num1== num2){
            System.out.println("Number are Equal");
        }else {
            System.out.println("Number are not  Equal");

        }
    }
}
