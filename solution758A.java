import java.util.*;

public class solution758A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        int max = a[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            sum += max - a[i];
        }
        System.out.println(sum);
        sc.close();
    }
}