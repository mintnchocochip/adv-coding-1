import java.util.*;

public class huffman {

    class Node {

        int count;
        char data;
        Node left;
        Node right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "helpless";
        char[] st = str.toCharArray();
        Arrays.sort(st);
        Map<Character, Integer> map = new TreeMap<>();
        for (Character ch : st) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }
}
