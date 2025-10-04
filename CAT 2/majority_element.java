import java.util.*;

class majority_element {

    public static void main(String args[]) {
        int[] arr = { 2, 4, 2, 5, 6, 2, 2, 3, 2, 2 };
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map.get(2));
        for (Integer i : map.keySet()) {
            if (map.get(i) > n / 2) {
                System.out.println("Majority element is::" + i);
            }
        }
    }
}
