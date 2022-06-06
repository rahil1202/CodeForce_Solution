import java.util.*;

public class solution456A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b)
                flag = true;
        }
        if (flag)
            System.out.println("Happy Alex");
        else
            System.out.println("Poor Alex");
        sc.close();
    }
}