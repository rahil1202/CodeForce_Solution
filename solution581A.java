import java.util.*;

public class solution581A {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        int diff = 0;
        int same = 0;
        if (a == 0 || b == 0) {
            int temp = Math.max(a, b);
            System.out.println(temp / 2 + " " + 0);
        } else {
            diff = Math.min(a, b);
            same = Math.abs(a - b);
            same /= 2;
        }
        System.out.println(diff + " " + same);
        ip.close();
    }
}