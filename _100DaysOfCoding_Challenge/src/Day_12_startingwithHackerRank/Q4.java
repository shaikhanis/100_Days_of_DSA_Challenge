package Day_12_startingwithHackerRank;

import java.util.Scanner;

// Q4 : https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
