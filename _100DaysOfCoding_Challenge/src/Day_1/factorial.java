package Day_1;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
         int fact =1;
        for (int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
        System.out.println(fact1(n));
    }
    // factorial using while loop
    static int  fact1(int n){
        int fact = 1; int i=1;
        while (i<=n){
            fact*=i;
            i++;
        }
        return fact;
    }
}
