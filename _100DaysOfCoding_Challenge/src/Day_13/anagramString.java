package Day_13;

// Q : https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
public class anagramString {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "margana";

        boolean ans = isAnagram(s1,s2);
        System.out.println(ans);
    }
    static boolean isAnagram(String a, String b) {
        String s2 = b;
        String s1 = a;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()==s2.length())
        {
            int[] arr = new int[256];
            int[] brr = new int[256];
            // Complete the function
            for (int i = 0; i < s1.length(); i++) {
                arr[s1.charAt(i)] += 1;
                brr[s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (arr[i] != brr[i])
                    return false;
            }
            return true;
        }
        else
        {
            return false;
        }
    }

}
