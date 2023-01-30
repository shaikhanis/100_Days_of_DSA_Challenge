package Day_21;

import java.util.Arrays;

public class _90DegreeRotated {
    public _90DegreeRotated() {
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        roted(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    static void roted(int[][] a) {
        int N = a.length;

        for(int i = 0; i < N / 2; ++i) {
            for(int j = i; j < N - i - 1; ++j) {
                int temp = a[i][j];
                a[i][j] = a[N - 1 - j][i];
                a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
                a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
                a[j][N - 1 - i] = temp;
            }
        }

    }

    static void transpose(int[][] arr) {
        int[][] ans = new int[3][3];

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                ans[i][j] = arr[j][i];
            }
        }

        System.out.println(Arrays.deepToString(ans));
    }

    static void reverse(int[] arr) {
        for(int i = 0; i < arr.length - i - 1; ++i) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
