package Day_4_Day_5;

import java.util.Scanner;
// in a given number how many days year and week
public class dayYearCal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = in.nextInt();

        int year = number/365;
        int week = number%365/7;
        int day = number%365%7;

        System.out.print("Number of year :"+year +"\n"+"Number of week :"+week+"\n"+"Number of days"+day);

    }
}
