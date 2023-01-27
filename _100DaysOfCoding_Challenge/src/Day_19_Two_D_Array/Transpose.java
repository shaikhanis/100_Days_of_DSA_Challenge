package Day_19_Two_D_Array;
import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please inter your m%n");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0 ; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int j = 0; j<m; j++){
            for(int i =0; i<n; i++){
                System.out.print( matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}