import java.util.*;

class unique_perm {

    public static void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void reverse(char[] a, int l, int r) {
        while (l < r) swap(a, l++, r--);
    }

    public static boolean nextPerm(char[] a) {
        int n = a.length;
        int i = n - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;
        if (i < 0) return false; // last permutation reached

        int j = n - 1;
        while (a[j] <= a[i]) j--; // rightmost successor
        swap(a, i, j);
        reverse(a, i + 1, n - 1); // reverse full suffix
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Arrays.sort(arr); // start from smallest

        ArrayList<String> out = new ArrayList<>();
        out.add(new String(arr));
        System.err.println(str); // add first permutation
        while (nextPerm(arr)) {
            out.add(new String(arr)); // add each next permutation
        }
        System.out.println(out);
    }
}
