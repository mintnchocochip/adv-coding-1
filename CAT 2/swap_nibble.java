import java.util.*;

public class swap_nibble {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int swapped = (((num & 0xF0) >> 4) | ((num & 0x0F) << 4));
        System.out.println(swapped);
    }
}
