package Day_15_Array;

import java.util.Arrays;
import java.util.Scanner;

public class insertValueInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = in.nextInt();
        int [] nums = {12,2,3,4,5,6,7,8,9,11};
        int[] ans = insert1(nums);
        int[] ans1 = insert(nums, number);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));

    }
    static int[] insert(int[] nums, int number){
        Scanner in = new Scanner(System.in);
        int pos = in.nextInt();

        for (int i=nums.length-1; i>pos-1; i--){
            nums[i] = nums[i-1];
        }
        nums[pos-1] = number;
        return nums;
    }
    static int[] insert1(int[] nums){
        int number = 15;
        int pos = 3;
        for (int i=0; i<nums.length; i++){
            if(i == pos)
            nums[i] = number;
        }
        return nums;
    }
}
