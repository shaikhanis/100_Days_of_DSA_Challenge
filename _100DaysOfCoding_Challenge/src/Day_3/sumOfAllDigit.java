package Day_3;

import java.util.Scanner;

// sum of all number given in the id number...
public class sumOfAllDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Id Number");
        int id = in.nextInt();
        int sum=0;
        while (id>0){
            int result = id%10;
            id = id/10;
            sum = sum+result;
        }
        System.out.println("Sum of all digit is"+sum);
    }
}
