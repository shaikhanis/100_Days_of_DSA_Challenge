package Day_4_Day_5;

import java.util.Scanner;

public class simpleAndCompoundInterest {
    private static float p;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        double p = in.nextDouble();
//        double r = sc.nextDouble();
//        double t = sc.nextDouble();
//
//        double amount = p*(Math.pow((1+r/100),t));
//        double CI = amount - p;
//
//        System.out.println("The compound Interest "+CI);

        System.out.println("please Enter P. R. T.");
        double p = in.nextFloat();
        double r = in.nextFloat();
        double t = in.nextFloat();

        double SI = (p*r*t)/100;


        System.out.println("Simple Intrest "+SI);
    }

}


