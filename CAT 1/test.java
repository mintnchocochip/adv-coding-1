import java.util.*;

class test {

    public static void main(String[] args) {
        int n = 8;
        String og = Integer.toBinaryString(n);
        System.out.println(
            og.equals(new StringBuilder(og).reverse().toString())
        );
    }
}
