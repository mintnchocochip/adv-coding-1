import java.util.*;

class binary_pali {

    public static void main(String[] args) {
        int n = 8;
        String og = Integer.toBinaryString(43);
        String rev = new StringBuilder(og).reverse().toString();
        int newi = Integer.parseInt(rev, 2);
        if (og.equals(rev)) {
            System.out.print(og);
        }
        System.out.println(newi);
    }
}
