package Day_24;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// binary search in infinite array amazon interview question...

public class infiniteArrayBinarySearch {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(infiniteSearch(nums,target));
    }

    static int infiniteSearch(int[] nums, int target){
        int str=0;
        int end = 1;

        while (target>nums[end]){
            // store the value of end in temp variable
          int temp = end+1;

          // doubling the value of end by *2

          end = end+(end-str+1)*2;

          // assigning the temp value to the start this is new start
            str = temp;
        }
        return search(nums,target,str,end);
    }

    // this is binary searching
    static int search(int[] nums, int target ,int str, int end){
        while (str<=end){
            int mid = str+(end-str)/2;
            if(target>nums[mid]){
                str=mid+1;
            }else if(target<nums[mid]){
                end =mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
