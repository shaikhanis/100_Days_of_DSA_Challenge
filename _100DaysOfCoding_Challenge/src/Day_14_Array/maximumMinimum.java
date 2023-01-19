package Day_14_Array;

public class maximumMinimum {
    public static void main(String[] args) {
        int[] nums = {4,7,8,9,2,3,6,1,45,75,89,12,35,14,48,-7};
        maxMin(nums);
    }
    static void maxMin(int[]nums){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);
    }
}
