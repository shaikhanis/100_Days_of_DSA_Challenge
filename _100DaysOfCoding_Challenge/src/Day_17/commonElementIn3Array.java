package Day_17;

import java.util.ArrayList;

public class commonElementIn3Array {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5,6,7,17};
        int [] arr2 ={7,9,10,11,15,17,21,28,30,33,35,36};
        int [] arr3 ={7,16,17,18,19,20,22,26,29};

        ArrayList<Integer> al = new ArrayList<>();
        int x = 0;
        int y = 0;
        int z = 0;
        while(x<arr1.length && y<arr2.length && z<arr3.length){
            if(arr1[x] == arr2[y] && arr2[y]==arr3[z]){
                al.add(arr1[x]);
                x++;
                y++;
                z++;
            }else if(arr1[x]<arr2[y]){
                x++;
            }else if(arr2[y]<arr3[z]){
                y++;
            }else {
                z++;
            }
        }
        for(int no : al){
            System.out.println(no);
        }
    }
}
