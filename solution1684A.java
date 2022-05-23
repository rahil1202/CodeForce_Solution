import java.util.*;

public class solution1684A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String txt = sc.next();
            char ch[] = txt.toCharArray();
            if (ch.length == 2) {
                System.out.println(ch[1]);
            } else {
                Arrays.sort(ch);
                System.out.println(ch[0]);
            }
        }
        sc.close();
    }
}