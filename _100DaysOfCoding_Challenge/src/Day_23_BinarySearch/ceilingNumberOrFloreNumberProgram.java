package Day_23_BinarySearch;

import java.util.Scanner;

// https://leetcode.com/problems/search-insert-position/solutions/1729111/java-100-ceiling-of-number/
// ceiling number means return the first
// We have to find the index of the largest number which is smaller than target (same as finding Ceiling of number)
public class ceilingNumberOrFloreNumberProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6,7,8,9,12,15,16,18,19,22};
        System.out.println("enter target");
        int target = in.nextInt();
        // this is a call for ceiling number +
        System.out.println(searchCeilingNumber(nums, target));

        // this is a call for flore number
        System.out.println(flore(nums, target));
    }
    static int searchCeilingNumber(int[] nums, int target){
        if (target > nums[nums.length - 1]) {
            return -1;
        }
        int str = 0;
        int end = nums.length-1;
        while (str <= end){
            int mid = str + (end-str)/2;

            if(target> nums[mid]){
                str = mid+1;
            }else if (target<nums[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return str;
    }

    // same like this program we can find flore of a number means the number is smallest than the target number
    static int flore(int[
            ] nums, int target){
        int str=0;
        int end = nums.length-1;
        while (str<=end){
            int mid= str+(end-str)/2;

            if(target > nums[mid]){
                str = mid+1;
            }else if(target<nums[mid]){
                end= mid-1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
