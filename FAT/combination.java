import java.util.*;

class combination {

    static void combine(
        int[] arr,
        int n,
        int r,
        int start,
        ArrayList<Integer> curr,
        ArrayList<ArrayList<Integer>> result
    ) {
        if (curr.size() == r) {
            System.out.println(curr);
            result.add(new ArrayList<Integer>(curr));
            return;
        }
        for (int i = start; i < n; i++) {
            curr.add(arr[i]);
            combine(arr, n, r, i + 1, curr, result);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int n = arr.length;
        int r = 2;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        combine(arr, n, r, 0, new ArrayList<Integer>(), result);
    }
}
