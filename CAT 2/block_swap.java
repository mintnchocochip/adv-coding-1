import java.util.*;

public class block_swap {

    public static void rotateLeft(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }
        k %= n;
        if (k > n) {
            return;
        }
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }

    public static void main(String args[]) {
        int n = 7;
        int k = 3;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotateLeft(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "");
        }
    }
}
