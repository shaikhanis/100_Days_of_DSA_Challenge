package Day_22_LinearSearch;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 // leetcode link  here count the number od even digit count...
public class evenDigitInArr {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896,12,12,1234,156};
        System.out.println(findEvenCount(nums));
    }

    static int findEvenCount(int[] nums){
        int count=0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int countNum = digit(num);
        /*

        if(countNum%2==0){
            return true;
        }
        return false;

         */
        return countNum % 2 == 0;
    }

    static int digit(int num){
        int count=0;
        while (num>0){
            num = num/10;
            count++;
        }
        return count;
    }


//    another method to count number of digit...
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
