package Day_21;

import java.util.Arrays;

public class addition {
    public addition() {
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(add(arr1, arr2)));
        System.out.println(Arrays.toString(sum(arr1, arr1)));
    }

    static int[] add(int[] arr, int[] arr1) {
        int a = arr.length;
        int b = arr1.length;
        int c = a + b;
        int[] c1 = new int[c];

        int i;
        for(i = 0; i < a; ++i) {
            c1[i] = arr[i];
        }

        for(i = 0; i < b; ++i) {
            c1[a + i] = arr1[i];
        }

        return c1;
    }

    static int[] sum(int[] a, int[] b) {
        int c = b.length;
        int[] c1 = new int[c];

        for(int i = 0; i < c; ++i) {
            c1[i] = a[i] + b[i];
        }

        return c1;
    }
}