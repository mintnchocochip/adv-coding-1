import java.util.*;

public class max_prod {

    public static int maxProd(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x < 0) {
                //if the current digit is negative we swap the min & max
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(x, max * x);
            min = Math.min(x, min * x);
            ans = Math.max(ans, max);
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] nums = { 2, 3, -4, 2, 3, -4 };
        System.out.println(maxProd(nums));
    }
}
