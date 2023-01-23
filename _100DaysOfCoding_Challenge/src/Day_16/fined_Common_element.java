package Day_16;

import java.util.HashSet;

public class fined_Common_element {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,4,5};
        int [] nums2 = {6,7,8,9,2,5};
        common(nums1, nums2);
        common3(nums1,nums2);
        System.out.println(common1(nums1,nums2));
    }
    static void common(int [] nums1, int[] nums2){
        for (int i : nums1){
            for (int j : nums2){
                if(i == j){
                    System.out.print(i + " ");
                }
            }
        }
    }
    static HashSet<Integer> common1(int[] nums1, int[] nums2){
        HashSet <Integer> hs = new HashSet<>();
        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k) {
                    hs.add(j);
                }
            }
        }
//        for (int no : hs){
//            System.out.print(no+" ");
        return hs;
    }
    static void common3( int[] nums1, int [] nums2){
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int no :nums1){
            hs1.add(no);
        }
        for(int no : nums2){
            hs2.add(no);
        }
        for(int no : nums2){
            boolean b =hs1.add(no);

            if(!b){
                System.out.println("same element is "+no);
            }
        }
    }
}

