package Day_18;

import java.util.Arrays;
import java.util.HashSet;

public class sumOfTwoArrayElement {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {7,8,9,10,11,12};
        int  n = nums2.length;
        int [] resultArr = new int[n];

        for (int i=0; i<resultArr.length; i++){
            resultArr[i] = nums1[i] + nums2[i];
        }

        System.out.println(Arrays.toString(resultArr));


        int [] nums={1,2,3,4,5,6,1,2,3,4,5,6};
        System.out.println(dup(nums));
    }
    static HashSet<Integer> dup(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
             return hs;
    }
}
