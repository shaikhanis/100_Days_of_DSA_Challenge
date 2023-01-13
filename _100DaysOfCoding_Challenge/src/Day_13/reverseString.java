package Day_13;

import java.util.Scanner;

// Q : https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
public class reverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        StringBuilder rev = new StringBuilder();
//        for (int i=s.length()-1; i>=0; i--){
//            rev.append(s.charAt(i));
//        }
//        System.out.println(rev);


       // check String is palindrome or not
        String A=in.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder rev = new StringBuilder();
        for(int i=A.length()-1; i>=0; i--)
            rev.append(A.charAt(i));
        if(rev.toString().equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
