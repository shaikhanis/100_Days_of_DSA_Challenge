package Day_17;

import java.util.ArrayList;

public class evenAndOddNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(evenOdd(nums));
        System.out.println(sumOfEvenOdd(nums));
    }
    static ArrayList<Integer> evenOdd(int[] nums) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i : nums) {
            if (i % 2 == 0) {
                al1.add(i);
            } else {
                al2.add(i);
            }
        }
        System.out.println("all even number are : "+al2);
        System.out.print("all odd number are : ");
        return al1;
    }
    static int sumOfEvenOdd(int[] nums) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i : nums) {
            if (i % 2 == 0) {
                al1.add(i);
            } else {
                al2.add(i);
            }
        }
        int totalEven = 0;

        int totalOdd = 0;

        for (int i : al1){
            totalOdd += i;
        }

        for (int i : al2){
            totalEven += i;
        }
        System.out.println("how many number is odd : "+ al1.size());
        System.out.println("how many number is even : "+ al2.size());
        System.out.println("sum of all even is : "+totalEven);
        System.out.print("sum of all odd number is : ");
        return totalOdd;
    }
}
