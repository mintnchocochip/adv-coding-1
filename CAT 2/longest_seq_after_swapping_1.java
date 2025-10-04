import java.util.*;

public class longest_seq_after_swapping_1 {

    public static int doert(int[] a, int k) {
        int maxOne = Integer.MIN_VALUE;
        int repl = 0;
        int start = 0;
        for (int end = 0; end < a.length; end++) {
            if (a[end] == 0) {
                //keeping track of number of 0s in the window
                repl++;
            }
            while (repl > k) {
                //moving start from the left to right if its 0 & number of 0 > k
                if (a[start] == 0) {
                    repl--;
                }
                start++;
            }
            maxOne = Math.max(maxOne, end - start + 1);
        }
        return maxOne;
    }

    public static void main(String args[]) {
        int[] a = { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0 };
        int k = 1;
        System.out.println(doert(a, k));
    }
}
