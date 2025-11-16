import java.util.*;

class simple_sieve {

    public static void main(String args[]) {
        int n = 45;
        boolean[] arr = new boolean[45];
        for (int i = 0; i < n; i++) {
            arr[i] = true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (arr[i]) {
                for (int j = i * i; j < n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }
}
