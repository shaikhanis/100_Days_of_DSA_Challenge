package Day_2;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = in.nextInt();
        int count = 0;
        for (int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println("isPrime");
        }else {
            System.out.println("NotPrime");
        }
    }
}
