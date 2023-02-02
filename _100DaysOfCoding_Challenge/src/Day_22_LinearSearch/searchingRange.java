package Day_22_LinearSearch;

public class searchingRange {
    public static void main(String[] args) {
        int [] nums= {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int str=3, end=9;
        int ans = searchInRange(nums,target,str,end);
        System.out.println(ans);
    }
    static int searchInRange(int [] nums, int target, int s, int e){
        if (nums.length == 0) {
            return -1;
        }
        for (int i=s; i<=e; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
