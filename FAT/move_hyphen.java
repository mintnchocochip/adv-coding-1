import java.util.*;

class move_hyphen {

    public static void main(String[] args) {
        String str = "I - love--Java";
        char[] arr = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : arr) {
            if (c == '-') {
                result.insert(0, c);
            } else {
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}
