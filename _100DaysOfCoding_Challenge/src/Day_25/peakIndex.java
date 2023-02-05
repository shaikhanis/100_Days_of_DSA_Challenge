package Day_25;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peakIndex {
    public static void main(String[] args) {
        int[] nums = {0,1,2,1,0};
        System.out.println(search(nums));
    }
    static int peakIndexInMountainArray(int[] nums) {
        int i=0;
        while (nums[i] <nums[i+1]){
            i++;
        }
        return i;
    }
    static int search(int [] nums){
        int str =0;
        int end = nums.length-1;

        while (str<end){
            int mid = str+(end-str)/2;
            if(nums[mid]<nums[mid+1]){
                str = mid+1;
            }else {
                end=mid;
            }
        }
        return end;
    }
}
