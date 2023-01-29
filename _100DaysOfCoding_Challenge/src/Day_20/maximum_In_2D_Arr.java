package Day_20;

public class maximum_In_2D_Arr {
    public static void main(String[] args) {
        int[][] nums = {
                {15, 3, 5, 2, 4, 86, 16, 78,},
                {11, 22, 33, 44, 55, 66, 77},
                {77, 88, 99, 100, 220, 852, 52,}
        };
        System.out.println(maximum(nums));
    }

    static int maximum(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for (int[] num : nums) {
            for (int i : num) {
                if (i > max)
                    max = i;
            }
        }
        return max;
    }
}