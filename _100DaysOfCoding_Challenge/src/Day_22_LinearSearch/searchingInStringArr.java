package Day_22_LinearSearch;

import java.util.Objects;

public class searchingInStringArr {
    public static void main(String[] args) {
        String [] name= {"anis", "adil", "potha", "pawan", "muhammad", "ajay", "altaf", "tejas"};
        String target = "tejas";
        System.out.println(search(name, target));
    }
    static int search(String[] names, String tar){
        for (int i=0; i<names.length; i++){
            if(Objects.equals(names[i],tar)){
                return i;
            }
        }
        return -1;
    }
}

