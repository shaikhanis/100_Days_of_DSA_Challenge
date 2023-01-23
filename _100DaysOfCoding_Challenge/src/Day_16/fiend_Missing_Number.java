package Day_16;

public class fiend_Missing_Number {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,9,10};
        System.out.println(missingNumber(nums));
        System.out.println(missing(nums));
    }
    // this is the one why by using bit
    static int missing(int[] nums) {
        int xor1 = nums[0];
        for (int i=1; i<nums.length; i++){
            xor1 = xor1^nums[i];
        }
        int xor2 = 1;
       for (int i=2; i<=nums.length+1; i++){
           xor2 = xor2^i;
       }
       return xor1^xor2;
    }

    static int missingNumber(int[] nums) {
        int n = nums.length+1;
        int total = n * (n + 1) / 2;
        int sum =0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
        }
    return total-sum;
    }
}
