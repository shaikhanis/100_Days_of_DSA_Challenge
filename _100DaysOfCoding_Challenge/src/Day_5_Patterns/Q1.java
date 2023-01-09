package Day_5_Patterns;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        // 1. Pattern.
        // WAP to print following Pattern
        //   * * * * *
        //   * * * *
        //   * * *
        //   * *
        //   *
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}
