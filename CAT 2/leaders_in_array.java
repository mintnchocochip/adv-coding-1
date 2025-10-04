import java.util.*;

public class leaders_in_array {

    public static void main(String args[]) {
        int[] arr = { 2, 4, 6, 3, 1, 2 };
        int n = arr.length;
        int leaders = 0;
        ArrayList<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        result.add(arr[n - 1]);
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                leaders++;
                max = arr[i];
                result.add(arr[i]);
            }
        }
        System.out.println(leaders);
        System.out.println(result);
    }
}
