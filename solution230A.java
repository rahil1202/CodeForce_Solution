import java.util.*;

public class solution230A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        boolean check = true;
        int array[][] = new int[n][2];
        for (int i = 0; i < n; ++i) {
            array[i][0] = sc.nextInt(); // dragon strength
            array[i][1] = sc.nextInt(); // bonus
        }
        Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            if (s > array[i][0]) {
                s += array[i][1];
            } else {
                check = false;
                break;
            }

        }

        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
