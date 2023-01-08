package Day_4;

import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number you want to check: ");
        int n = in.nextInt();
        int remainder, number, sum = 0;
        number = n;
        while (number > 9)
        {
            while (number > 0)
            {
                remainder = number % 10;
                number = number / 10;
                sum = sum + remainder;
            }
            number = sum;
            sum = 0;

        }
        if (number == 1)
        {
            System.out.println("The given number is a magic number.");
        }
        else
        {
            System.out.println("The given number is not a magic number.");
        }
    }

}
