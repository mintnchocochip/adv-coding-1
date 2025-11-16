import java.util.*;

class move_hyphen {

    public static void main(String[] args) {
        String str = "I - love--Java";
        char[] arr = str.toCharArray();
        StringBuilder result = new StringBuilder();
        StringBuilder hy = new StringBuilder();

        for (char c : arr) {
            if (c == '-') {
                hy.append(c);
            } else {
                result.append(c);
            }
        }
        System.out.println(hy.append(result.toString()).toString());
    }
}
