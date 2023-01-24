package Day_17;

public class secondLargestElement {
    public static void main(String[] args) {
        int [] nums = {1,4,5,2,3,55,554,6552,545,51,63,41,6321,316,41,31,31,6521};
          int ans = secondLargest(nums);
        System.out.println(ans);
    }
//    static void secondLargest(int [] nums){
//        int i, first, second;
//        int  n = nums.length;
//        first = second = Integer.MIN_VALUE;
//        for (i = 0; i < n; i++) {
//            if (nums[i] > first) {
//                second = first;
//                first = nums[i];
//            }
//            else if (nums[i] > second && nums[i] != first)
//                second = nums[i];
//        }
//        if (second == Integer.MIN_VALUE) {
//            System.out.print("There is no second largest"
//                    + " element\n");
//        }else{
//            System.out.print("The second largest element"
//                    + " is " + second);
//        }
//    }
    static int secondLargest(int[] nums){
        int largest = 0;
        int secondLargest = 0;
        for (int i=0; i< nums.length; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
}
