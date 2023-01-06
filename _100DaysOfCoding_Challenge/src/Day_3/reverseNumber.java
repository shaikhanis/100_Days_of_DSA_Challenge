package Day_3;

import java.util.Scanner;
// reverse a given number
public class reverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = in.nextInt();
        int reverse=0;
        while (number>0){
            int result = number%10;
            number = number/10;
            reverse = reverse *10 +result;
        }
        System.out.println(reverse);
    }
}
