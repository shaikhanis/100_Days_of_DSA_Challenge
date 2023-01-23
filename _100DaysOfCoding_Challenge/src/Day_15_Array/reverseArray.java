package Day_15_Array;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,7,7,8,9,75,6546,54,643,56,3465,345,345,6543,634,6,5346,45};
        System.out.println(Arrays.toString(rever̥se(nums)));
    }
    static int[] rever̥se (int[]nums){
        int n = nums.length;
        for (int i=0; i<n-i-1; i++) {
            int temp = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = temp;
        }
        return nums;
    }

}
