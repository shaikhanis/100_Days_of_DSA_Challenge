package Day_14_Array;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int size = in.nextInt();

        int[] nums = new int[size];
        for (int i=0; i<size; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(max(nums));
    }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
}
