package Day_17;


import java.util.Arrays;

public class fiend_Kth_Element {
    public static void main(String[] args) {

        int [] nums = {2,3,4,5,6,7,8,9,52,554,51,55,5,45,41,655,5,4,541,854,5,4};
        System.out.print(kthSmallest(nums, 10));

    }
    static int kthSmallest(int [] nums, int K)
    {
        Arrays.sort(nums);

        return nums[K - 1];

    }
}

