package Day_13;
import java.util.*;
// Q https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
public class subString{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        int a = S.length();
        char[] ch = new char[a];

        for(int i=0; i<a; i++){
            ch[i] = S.charAt(i);
        }
        for(int i=start; i<end; i++){
            System.out.print(ch[i]);
        }
    }
}
