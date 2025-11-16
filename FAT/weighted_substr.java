import java.util.*;

class weighted_substr {

    public static void weightAssign(Map<Character, Integer> m, char[] w) {
        String alp = "abcdefghijklmnopqrstuvwxyz";
        int idx = 0;
        for (char ch : alp.toCharArray()) {
            m.put(ch, (int) w[idx++] - 48);
        }
    }

    public static int findTotalWeight(Map<Character, Integer> m, char[] w) {
        int tot = 0;
        for (char ch : w) {
            tot += m.get(ch);
        }
        return tot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "acbacbacaa"; //sc.nextLine();
        String weights = "12300045600078900012345000"; //sc.nextLine();
        char[] w = weights.toCharArray();
        int k = 2; //sc.nextInt();
        Map<Character, Integer> char_weight = new HashMap<>();
        weightAssign(char_weight, w);
        System.out.println(char_weight);
        int n = str.length();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                char[] slice = Arrays.copyOfRange(str.toCharArray(), j, j + i);
                int weight = findTotalWeight(char_weight, slice);
                if (weight <= k) {
                    System.out.println(new String(slice) + weight);
                }
            }
        }
    }
}
