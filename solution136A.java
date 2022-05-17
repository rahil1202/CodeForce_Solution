import java.util.Scanner;

public class solution136A {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();

        }
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < n; y++) {
                if ((numbers[y] - 1) == i) {
                    System.out.print((y + 1) + " ");
                    break;
                }
            }
        }
        in.close();
    }
}