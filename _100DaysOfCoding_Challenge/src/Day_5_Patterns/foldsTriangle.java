package Day_5_Patterns;

public class foldsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
  //              number = number+j;
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
