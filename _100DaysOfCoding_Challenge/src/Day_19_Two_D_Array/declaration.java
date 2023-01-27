package Day_19_Two_D_Array;

import java.util.Scanner;

public class declaration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter row");
        int row = in.nextInt();
        System.out.println("Enter Col");
        int col = in.nextInt();

        int [][] nums = new int[row][col];
        System.out.println("Array Element");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                nums[i][j] = in.nextInt();
            }
        }
        for (int[] i : nums){
            for (int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
