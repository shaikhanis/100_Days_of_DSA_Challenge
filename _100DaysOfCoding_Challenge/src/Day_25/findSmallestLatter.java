package Day_25;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class findSmallestLatter {
    public static void main(String[] args) {
        char[]letters = {'c','f','j'};
        char target = 'a';
        System.out.println(search(letters,target));
    }
    static char search(char[] letter, char target){
        int str =0;
        int end = letter.length-1;

        while (str<=end){
            int mid = str+(end-str)/2;

            if(target>letter[mid]){
                str = mid+1;
            }else {
                end=mid-1;
            }
        }
        return letter[str%letter.length];
    }
}
