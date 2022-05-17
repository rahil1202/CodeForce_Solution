import java.util.Scanner;

public class solution228A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num[] = new int[4];
        int count = 0;

        for (int j = 0; j <= 3; j++) {
            num[j] = sc.nextInt();
        }

        int i = 0;
        while (i < 4) {
            if (num[i] == num[i + 1])
                ++count;
        }
        System.out.println(count);
        sc.close();
    }
}