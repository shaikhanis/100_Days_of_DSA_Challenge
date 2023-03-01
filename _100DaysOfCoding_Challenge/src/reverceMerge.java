import java.util.*;

public class reverceMerge {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {10,9,8,7,6};

        int[] num3 = new int[nums1.length+nums2.length];

        Arrays.sort(nums2);

        int j=0;
        for (int i=0; i<nums2.length; i++){
            num3[j++] = nums1[i];
            num3[j++] = nums2[i];
        }
        System.out.println(Arrays.toString(num3));
    }
}
