package Day_18;

public class maximumSumSubArray {
    public static void main(String[] args) {
        /*
        int this program ve study about the how to
        calculate the maximum sum of sub array from the main array
         */
        int [] a ={4,-2,-3,4,-1,-2,1,5,-3};
 //         int [] a = {1,2,3,4,5,-10,-15,20,10,15};
        int max_so_far = Integer.MIN_VALUE;
        int max_end_here =0;
        int start=0, end=0, s=0;

        for(int i =0; i<a.length; i++){
            max_end_here=max_end_here+a[i];
            if(max_so_far<max_end_here){
                max_so_far = max_end_here;
                start=s;
                end=i;
            }
            if(max_end_here<0){
                max_end_here=0;
                s =i+1;
            }
        }
        System.out.println("Maximum sum of sub array is "+max_so_far);
        System.out.println("Starting index position is : "+start);
        System.out.println(" Ending index position is "+end);
    }
}