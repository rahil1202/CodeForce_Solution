import java.util.*;

public class solution474A {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String a = "qwertyuiopasdfghjkl;zxcvbnm,./";
        int move = sc.next().charAt(0) == 'R' ? -1 : 1;
        char[] s = sc.next().toCharArray();
        for (int i = 0; i < s.length; i++) {
            s[i] = a.charAt(a.indexOf(s[i]) + move);
        }
        System.out.println(new String(s));
    }
}