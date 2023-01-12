package Day_6_Day_7_Day_8_Patterns;

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i<=n; i++) {

            for (int j = 0; j <= i; j++) {
                if (i ==0 || j==0 || i==n ||j==i ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
