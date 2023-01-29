package Day_20;

public class maximum_Wealth {
    // maxim sum of each individual array,
    public static void main(String[] args) {
        int[][] nums = {
                {15, 3, 5, 2, 4, 86, 16, 78,},
                {11, 22, 33, 44, 55, 66, 77},
                {77, 88, 99, 100, 220, 852, 52,}
        };
        System.out.println((maximumWealth(nums)));
    }
    static int maximumWealth(int[][] accounts) {
        int sum = 0, max=0;

        for (int[] account : accounts) {
            for (int i : account) {
                sum += i;
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}