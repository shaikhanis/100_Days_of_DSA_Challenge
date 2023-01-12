package Day_12_startingwithHackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Q6 : https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1; i<=10; i++){
            int result = N*i;
            System.out.printf("%d x %d = %d \n",N,i,result);
        }

        bufferedReader.close();
    }
}
