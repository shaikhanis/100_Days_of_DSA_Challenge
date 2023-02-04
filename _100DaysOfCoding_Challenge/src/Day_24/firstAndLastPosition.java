package Day_24;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 15;
        System.out.println(Arrays.toString(search(nums, target)));
    }

    static int[] search(int[] nums, int target){
        int[] ans = {-1,-1};

        nums[0] = searchOfIndex(nums,target,true);
        if(nums[0] !=-1){
            ans[1] = searchOfIndex(nums , target ,false);
        }
        return ans;
    }
    static int searchOfIndex(int [] nums, int target, boolean fistIndex){
        int str =0; int ans =-1;
        int end = nums.length-1;
        int mid;
        while (str<=end){
            mid = str+(end-str)/2;

            if (target>nums[mid]){
                str = mid+1;
            }else if(target < nums[mid]){
                end = mid-1;
            }else {
                ans = mid;
                if(fistIndex){
                    str=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return ans;
    }
}
