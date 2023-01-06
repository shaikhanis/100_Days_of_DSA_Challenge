package Day_3;

import java.util.Scanner;
// check given number is palendrom or not.
public class palendrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number =in.nextInt();
        int num = number;
        int pal=0;

        while (number>0){
            int result = number%10;
            number = number/10;
            pal = pal*10 +result;
        }
        if(num == pal){
            System.out.println("the given number is palendrom");
        }else {
            System.out.println("not a palendrom");
        }
    }
}
