package Day_18;

import java.util.Arrays;

public class mergeTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int nums3 = nums1.length+nums2.length;
        int[] merge = new int[nums3];

        // this is bruteforce approach..
//        for (int i=0; i<nums1.length; i++){
//            merge[i] = nums1[i];
//        }
//
//        for (int i=0; i<merge.length; i++) {
//            merge[nums1.length+i] = nums2[i];
//        }
//        System.out.println(Arrays.toString(merge));

        // this is optimized solution
        System.arraycopy(nums1, 0, merge,0, nums1.length);
        System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);
        System.out.println(Arrays.toString(merge));
    }
}
