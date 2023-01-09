package Day_5_Patterns;

import java.util.Scanner;
public class Q4 {
        /*
        WAP to print following Pattern
          ABCDEFGFEDCBA
          ABCDEF FEDCBA
          ABCDE   EDCBA
          ABCD     DCBA
          ABC       CBA
          BA         BA
          A           A
*/
        public static void main(String[] args)
        {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows from the user
 //           System.out.println("Enter the number of rows needed to in the pattern ");

            int n = scanner.nextInt();

//            System.out.println("## Printing the pattern ##");

            int alphabet = 65;

            for(int i=0;i<= n;i++)
            {
                for(int j=0;j<=n-i;j++)
                {
                    System.out.print((char)(alphabet+j));
                }
                for(int k=1;k<=i*2-1; k++)
                {
                    System.out.print(" ");
                }
                for(int l=n-i; l>=0; l--)
                {
                    if(l!=n)
                        System.out.print((char)(alphabet+l));
                }
                System.out.println();
            }
        }
}