package Day_18;

import java.util.Arrays;

public class swap_Array {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverse(nums)));
    }
    static void swap(int [] nums, int s, int e){
        int temp;
        temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }

    static void swap2(int[] arr){
        int temp = arr[3];
        arr[3] = arr[5];
        arr[5] = temp;
    }

    static int[] reverse(int[] nums){
        int n = nums.length-1;
        for (int i=0; i<nums.length-i; i++){
            int temp = nums[i];
            nums[i] = nums[n-i];
            nums[n-i] = temp;
        }
        return nums;
    }
}
