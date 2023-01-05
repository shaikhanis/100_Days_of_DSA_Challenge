package Day_1;
//sum od 10 natural number using do while
public class do_While {
    public static void main(String[] args) {
        int n=10;
        int sum =0;
        int i=1;
        do{
            sum = sum+i;
            i++;

        }while (i<=n);
        System.out.println(sum);
    }
}
