package Day_16;

public class fiend_Single_Element {
    public static void main(String[] args) {
        // single element mains the element is available in one in an array or lonely element
        int[] nums = {2,3,4,5,2,3,4,5,6};
        int[] nums1 = {2,3,4,5,2,3,4,5,6,8};
        System.out.println(lonely(nums));
        System.out.println(sumOfLonely(nums1));
    }
    // this program prints the lonely number
    static int lonely(int[] nums){
        int result = nums[0];
        for (int i=1; i<nums.length; i++){
            result = result^nums[i];
        }
        return result;
    }
    // this prints the sum of lonely number
    static int sumOfLonely(int[] nums){
        int result = nums[0];

        for (int i=1; i<nums.length; i++){
            result = result^nums[i];
        }
        return result;
    }
}
