package Day_1;
// print the series like this 1 10 2 9 3 8 4 7 5 6 6 5 7 4 8 3 9 2 10 1
public class series {
    public static void main(String[] args) {
        int n=10;
        int m=10;
        for (int i=1; i<=n; i++){
            System.out.print(i+" ");
            System.out.print(m+" ");
            m--;

        }
    }
}
