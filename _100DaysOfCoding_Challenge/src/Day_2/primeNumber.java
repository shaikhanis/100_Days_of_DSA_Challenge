package Day_2;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number");
//        int n = sc.nextInt();
//        int count = 0;
//        for (int i=1; i<=n; i++){
//            if(n%i == 0){
//                count++;
//            }
//        }
//        if(count==2){
//            System.out.println("isPrime");
//        }else {
//            System.out.println("NotPrime");
//        }
       // print the prime number from range (0 to n)..
        int i,j;
        int count = 0;
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(i = n1; i <n2; i++){
            for(j = 2; j<i; j++){
                if(i%j == 0){
                    break;
                }
            }
            if(i==j){
                System.out.print(j+" , ");
                count ++;
            }
        }
        System.out.println();
        System.out.println("count is "+count);
    }
}
