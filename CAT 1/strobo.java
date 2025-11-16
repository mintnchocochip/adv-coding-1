import java.util.*;

class strobo {

    public static void main(String[] args) {
        String num = "96";
        StringBuilder num_180 = new StringBuilder();
        boolean isStrobo = true;
        for (char c : num.toCharArray()) {
            if (c == '6') {
                num_180.append('9');
            } else if (c == '9') {
                num_180.append('6');
            } else if (c == '8' || c == '0' || c == '1') {
                num_180.append(c);
            } else {
                System.out.println("NOT STROBO");
                isStrobo = false;
                break;
            }
        }
        String rotatedReversed = num_180.reverse().toString();
        System.out.println(rotatedReversed);
        System.out.println(num);
        if (rotatedReversed.equals(num) && isStrobo) {
            System.out.println("STROBO");
        } else {
            System.out.println("NO STROBO");
        }
    }
}
