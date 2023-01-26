package Day_18;

import java.util.HashSet;

public class longestSubSequence {
    public static void main(String[] args) {
        int[] nums = {3,9,1,4,10,20,2};

        System.out.println(longestSubSequence(nums));

    }
    static int longestSubSequenceInArray1(int [] nums){
        HashSet <Integer> hs = new HashSet<>();
        for (int j : nums) {
            hs.add(j);
        }

        int longSub = 0;

        for (int j : nums) {
            if (!hs.contains(j - 1)) {
                int no = j;

                while (hs.contains(no)) {
                    no++;
                }
                if (longSub < no - j) {
                    longSub = no - j;
                }
            }
        }
        return longSub;
    }
    static int longestSubSequence(int[] nums){
        int longSub=0;
        int count=0;
        HashSet <Integer> hs = new HashSet<>();
        for (int i: nums){
            hs.add(i);
        }

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
