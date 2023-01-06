package Day_3;

import java.util.Scanner;

public class leap_Year_Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = in.nextInt();

        if ((year % 400 == 0)  || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }
    }
}
