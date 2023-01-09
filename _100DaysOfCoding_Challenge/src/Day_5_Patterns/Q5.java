package Day_5_Patterns;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int alphabet = 65;
        for (int i = n; i>=0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(alphabet+j));
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");

            }
            for (int j = i; j >=0; j--) {
                System.out.print((char)(alphabet+j));
            }
            System.out.println();
        }
    }
}
