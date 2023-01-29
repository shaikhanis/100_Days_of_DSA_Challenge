package Day_20;

import java.util.Arrays;

public class searchingInTwoDArr {
    public static void main(String[] args) {
        int[][] arr = {
                {15, 3, 5, 2, 4, 86, 16, 78,},
                {11, 22, 33, 44, 55, 66, 77},
                {77, 88, 99, 100, 220, 852, 52,}
        };
        
        int target = 55;
        int[] ans = search(arr , target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target)

                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}