import java.util.*;

public class lexo_first {

    public static void main(String args[]) {
        String st = "malaalam";
        char[] arr = st.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Character> sorted = new ArrayList<>(map.keySet());
        Collections.sort(sorted);
        int count = 0;
        for (Character i : sorted) {
            if (map.get(i) % 2 != 0) {
                count++;
                if (count > 1) {
                    System.out.println("Poda venna");
                    return;
                }
            }
        }
        ArrayList<Character> first = new ArrayList<>();
        ArrayList<Character> odd = new ArrayList<>();

        for (Character i : sorted) {
            if (map.get(i) % 2 != 0) {
                for (int k = 0; k < map.get(i); k++) {
                    odd.add(i);
                }
                continue;
            }
            for (int k = 0; k < map.get(i) / 2; k++) {
                first.add(i);
            }
        }
        ArrayList<Character> last = new ArrayList<>(first);
        Collections.sort(last, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Character i : first) sb.append(i);
        for (Character i : odd) sb.append(i);
        for (Character i : last) sb.append(i);
        System.out.println(sb.toString());
    }
}
