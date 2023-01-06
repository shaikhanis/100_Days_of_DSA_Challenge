package Day_3;

import java.util.Scanner;

// write a program to count number of Digit in any number
//EX input = 12345
// output = 5;
public class Digit_Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Year");
        int number = in.nextInt();
        int count=0;
        while (0<number){
            number  = number/10;
            count++;

        }
        System.out.println("count of given number is"+count);
    }
}
