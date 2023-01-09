package Day_4;

import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number you want to check: ");
        int number = in.nextInt();
        int sum=0;
        while (number>0 || sum>9){
            if(number==0){
                number=sum;
                sum=0;
            }
            sum+=number%10;
            number = number/10;
        }
        if (sum == 1)
        {
            System.out.println("The given number is a magic number.");
        }
        else
        {
            System.out.println("The given number is not a magic number.");
        }
    }

}
