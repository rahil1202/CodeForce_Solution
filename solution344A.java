import java.util.Scanner;

public class solution344A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = 1;
        String temp1 = sc.next();
        for (int i = 1; i < n; i++) {
            String s = sc.next();
            if (i % 2 == 0) {
                if (s.equals(temp1)) {
                } else {
                    temp++;
                    temp1 = s;
                }
            } else {
                if (s.equals(temp1)) {
                } else {
                    temp++;
                    temp1 = s;
                }
            }
        }
        System.out.println(temp);
        sc.close();
    }
}
