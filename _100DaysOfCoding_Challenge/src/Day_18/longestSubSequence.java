package Day_18;

import java.util.HashSet;

public class longestSubSequence {
    public static void main(String[] args) {
        int[] nums = {3, 9, 1, 4, 10, 20, 2};

        System.out.println(longestSubSequenceOfAnArray(nums));

    }
    static int longestSubSequenceOfAnArray(int[] nums){
        int longSub=0;
        int count;
        HashSet <Integer> hs = new HashSet<>();
        for (int i: nums){
            hs.add(i);
        }
        System.out.println(hs);
        for (int i : nums){
            if(!hs.contains(i-1)) {
                count = i;

                while (hs.contains(count)) {
                    count++;
                }
                if (longSub < count - i)
                    longSub = count - i;
            }
        }
        return longSub;
    }
}
