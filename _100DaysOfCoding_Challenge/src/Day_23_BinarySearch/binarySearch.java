package Day_23_BinarySearch;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the target value");
        int target = in.nextInt();
        System.out.println(search(nums,target));
    }
    static int search(int[] nums,int target){
        int start = 0, end = nums.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if(target>nums[mid]){
                start = mid+1;
            } else if (target<nums[mid]) {
                end= mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
