package Day_15_Array;
// means array without any name or declaration
public class anonymousArray {
    public static void main(String[] args) {
        anonymousArray.sum (new int[]  {1,3,2,4,5,6,7,89});
    }
    static void sum(int [] nums){
        int total =0;
        for (int i : nums){
            total+= i;
        }
        System.out.println(total);
    }
}

