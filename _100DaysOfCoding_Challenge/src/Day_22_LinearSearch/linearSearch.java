package Day_22_LinearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {1,23,45,8,5,62,5,5,63,1,855,46,1,45,85,6,5,62,5,4,5,41,554,4,65,64,};
        int target = 0;
        int ans = searching(nums,target);
        System.out.print(ans);
    }
    // element present in arr this returns the index number else return the -1.
    static int searching (int [] nums , int target ){
        for (int i=0; i<nums.length; i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}
