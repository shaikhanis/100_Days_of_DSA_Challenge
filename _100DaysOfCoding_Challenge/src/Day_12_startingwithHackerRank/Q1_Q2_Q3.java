package Day_12_startingwithHackerRank;
import java.util.Scanner;
/*
Q1  : https://www.hackerrank.com/challenges/welcome-to-java/problem?isFullScreen=true
Q2  : https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
Q3  : https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true

*/
public class Q1_Q2_Q3 {
    public static void main(String[] args) {

        /*
        Q1  :  public static void main(String[] args) {
         Enter your code here. Print output to STDOUT. Your class should be named Solution.
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
         */
        // Q2 :
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // Complete this line
        // Complete this line

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // Complete this line
        // Complete this line

        //Q3  :
        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String ans;
        if(N%2 !=0){
            ans = "Weird";
        }
        else{
            if(N>6 && N<=20){
                ans = "Weird";
            }
            else{
                ans = "Not Weird";
            }
        }
        System.out.print(ans);
    }
}
