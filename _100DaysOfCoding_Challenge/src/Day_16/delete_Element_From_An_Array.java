package Day_16;

public class delete_Element_From_An_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,9};
        delete(nums);
    }
    static void delete(int[] nums){
        int temp=0;
        int delete = 9;
        for (int i=0; i<nums.length; i++){
            if(nums[i] == delete){
                for (int j=i; j<nums.length-1; j++){
                    nums[j] = 0;
                }
                temp++;
                break;
            }
        }
        if(temp == 1){
            System.out.println("element delete successful");
        }else {
            System.out.println("element is not in an array you want to delete");
        }
        for (int arr : nums){
            System.out.print(arr+" ");
        }
    }
}

