package Day_4;

import java.util.Scanner;

//here I am adding the Even and Odd Number from the range
public class sumOfEveOddNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1 = in.nextInt();
        System.out.println("Enter number 1");
        int n2 = in.nextInt();
        int sumOfEven=0;
        int sumOfOdd=0;
        for (int i=n1; i<=n2; i++){
            if(i%2==0){
                sumOfEven+=i;
            }else {
                sumOfOdd+=i;
            }
        }
        System.out.println(sumOfEven+"\n"+sumOfOdd);
    }
}
