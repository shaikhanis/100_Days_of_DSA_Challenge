package Day_17;

public class secondSmallest {
    public static void main(String[] args) {
        int[] nums = {3,55,5,16,521,215,165,651,65,4165,6512,65,6554,65,41,54,65,};
        int ans = secondSmallest(nums);
        int ans1 = secondMethod(nums);
        System.out.println( "second Smallest element is method 1 : "+ans);
        System.out.println( "second Smallest element is method 2 : "+ans1);

//        int smallest = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < smallest) {
//                smallest = nums[i];
//            }
//        }
//        System.out.println("smallest element is: " + smallest);
//        int second_smallest = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < second_smallest
//                    && nums[i] > smallest) {
//                second_smallest = nums[i];
//            }
//        }
//        System.out.println("second smallest element is: "+ second_smallest);
    }
    static int secondSmallest(int[] nums){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }
    static int secondMethod(int[] nums){
        int smallest, secondSmallest;
        smallest=secondSmallest=Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println( "Smallest element is : "+smallest);
        for (int num : nums) {
            if (num < secondSmallest && num > smallest) {

                secondSmallest = num;
            }
        }
        return secondSmallest;
    }
    
}
