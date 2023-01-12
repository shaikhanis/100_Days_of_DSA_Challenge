package Day_4_Day_5;

import java.util.Scanner;

public class evenOddNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int number = in.nextInt();
        evenNumber(number);
        oddNumber(number);
        evenOddNumberInRange(number);
    }
    static void evenNumber(int number){
        if(number%2==0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is not even");
        }
    }
    static void oddNumber(int number) {
        if (number % 2 != 0) {
            System.out.println("number is odd");
        } else {
            System.out.println("Number is not odd");
        }
    }
    static void evenOddNumberInRange(int number){
        for (int i=1; i<=number; i++){
            if(i%2 == 0){
                System.out.print("isEven : "+i+","+"\n");
            }else {
                System.out.print("isOdd : "+i+","+"\n");

            }
        }
    }
}
