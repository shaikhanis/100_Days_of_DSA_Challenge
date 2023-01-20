package Day_16;

import java.util.Scanner;

public class isInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter which number you want to search");
        int target = in.nextInt();
        int [] nums = {1,3,4,5,6,7,8,9342436,547,4567,546,453,654,654,};
        boolean ans = search(nums,target);
        System.out.println(ans);
    }

    static boolean search(int[] nums, int target){
        boolean isIn = false;
        for (int num : nums) {
            if (num == target) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }
}
