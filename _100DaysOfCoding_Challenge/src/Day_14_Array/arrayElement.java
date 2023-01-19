package Day_14_Array;

import java.util.Scanner;

public class arrayElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The size of array");

        int size = in.nextInt();
        int [] arr = new int [size];

        for (int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("array element");
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
