package Day_14_Array;

public class isSorted {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,8,10,7};
        boolean isSort = true;
        for (int i=0; i<nums.length-1; i++){
            if(nums[i]> nums[i+1]){
                isSort = false;
                break;
            }
        }
        if(isSort){
            System.out.println("is sorted");
        }else {
            System.out.println("not sorted");
        }
    }
}
