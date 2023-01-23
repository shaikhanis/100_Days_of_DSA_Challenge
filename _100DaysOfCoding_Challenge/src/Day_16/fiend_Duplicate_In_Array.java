package Day_16;

import java.util.HashSet;

public class fiend_Duplicate_In_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,5};
        int ans = duplicate(nums);
        System.out.println(ans);
        duplicate1(nums);
        duplicate2(nums);
    }
    static int duplicate(int[] nums){
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j] && i!=j)
                return nums[i];
            }
        }
        return -1;
    }
    static void duplicate1(int[] nums){
        int temp =0;
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j] && i!=j){
                    temp++;
                    System.out.println("The first duplicate element is : "+"index : "+ i+ "  number " + nums[i]);
                }
            }
        }
        if(temp == 0){
            System.out.println("duplicate number is not available");
        }
    }

    static void duplicate2(int [] nums){
        HashSet <Integer> hs = new HashSet<>();
        int i,  temp=-1;
        int len = nums.length;
        for ( i=len-1; i>0; i--){
            if(hs.contains(nums[i])){
                temp = i;
            }else {
                hs.add(nums[i]);
            }
        }
        if(temp !=-1){
            System.out.println("duplicate number is : " + nums[temp]);
        }else {
            System.out.println("not duplicate in array ");
        }
    }
}

