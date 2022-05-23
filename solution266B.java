import java.util.Scanner;

public class solution266B {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        String line = sc.next();
        char ch[] = line.toCharArray();
        while (t-- > 0) {
            for (int i = 1; i < n; i++) {

                if (ch[i] == 'G' && ch[i - 1] == 'B') {
                    ch[i] = 'B';
                    ch[i - 1] = 'G';
                    ++i;

                }
            }
        }
        String str = String.valueOf(ch);
        System.out.println(str);
        sc.close();
    }
}