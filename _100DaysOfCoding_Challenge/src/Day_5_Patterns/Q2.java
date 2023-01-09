package Day_5_Patterns;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Pattern.
        WAP to print following Pattern
1 2 3 4 5
2 3 4 5
3 4 5
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
         */

        int n = sc.nextInt();
        for (int i = 1; i<n; i++){
            for(int j = 1; j<n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int k = 1+2; k<=n; k++){
            for(int l = 1; l<k; l++){
                System.out.print(l+"  ");
            }
            System.out.println();

        }
    }
}
