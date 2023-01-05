package Day_1;

import java.util.Scanner;
//Print the smaller and larger number.
public class numberLessorGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1= in.nextInt();
        System.out.println("Enter Number 2");
        int num2= in.nextInt();
        if(num1>num2){
            System.out.println("number 1 is Greater Than num 2");
        }else if(num1<num2){
            System.out.println("number 2 is Greater Than num 1");
        }else {
            System.out.println("number 1 and  num 2 are equal");
        }
    }
}
