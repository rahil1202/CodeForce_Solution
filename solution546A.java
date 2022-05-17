//PROBLEM SET 546A

import java.util.Scanner;

public class solution546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), n = sc.nextInt(), w = sc.nextInt();
        int sum = 0;

        // w = no of banana he wants
        // k = price of the banana
        // n = no of dollars he have

        for (int i = 1; i <= w; i++) {

            sum = sum + k * i;
        }

        int ans = 0;
        if (n < sum) {
            ans = sum - n;
            System.out.println(ans);
        } else {
            ans = 0;
            System.out.println(ans);

        }

        sc.close();
    }

}