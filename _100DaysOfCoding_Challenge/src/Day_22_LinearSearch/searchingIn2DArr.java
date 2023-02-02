package Day_22_LinearSearch;

import java.util.Arrays;

public class searchingIn2DArr {
    public static void main(String[] args) {
        int[][] nums = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 99;
        System.out.println(Arrays.toString(search(nums, target)));
    }
    static int[] search(int [][] nums, int target){
        for(int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length; j++){
                if(nums[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
