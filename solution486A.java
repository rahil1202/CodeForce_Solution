import java.util.Scanner;

public class solution486A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        if (n % 2 == 0)
            sum = n / 2;
        else {
            sum = n / 2;
            sum = -(sum + 1);

        }
        System.out.println(sum);
        sc.close();

    }
}