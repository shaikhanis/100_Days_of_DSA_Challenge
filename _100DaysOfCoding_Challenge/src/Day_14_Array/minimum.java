package Day_14_Array;

public class minimum {
    public static void main(String[] args) {
        int [] nums = {5,7,14,544,4,54,51,4,54,74,51,8,4541,2,1,-1,-5};
        System.out.println(minimum(nums));
    }
    static int minimum(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}