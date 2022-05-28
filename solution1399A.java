import java.util.Arrays;
import java.util.Scanner;

public class solution1399A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0) {
            int len = sc.nextInt();
            int flag = 0;
            int arr[] = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < len - 1; i++) {
                if (arr[i + 1] - arr[i] > 1) {
                    flag = 1;
                    break;

                } else
                    continue;
            }
            if (flag == 1)
                System.out.println("NO");
            else
                System.out.println("YES");

        }
        sc.close(); //
    }
}