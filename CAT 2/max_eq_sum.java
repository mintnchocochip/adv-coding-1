import java.util.*;

public class max_eq_sum {

    public static int findun(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int prefix = 0;
            for (int j = 0; j <= i; j++) {
                prefix += arr[j];
            }
            int suffix = 0;
            for (int j = i; j < arr.length; j++) {
                suffix += arr[j];
            }
            if (prefix == suffix) {
                max = Math.max(max, prefix);
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 5, 3, 1, 2, 6, -4, 2 };
        System.out.println(findun(arr));
    }
}
