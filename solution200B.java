import java.util.*;

public class solution200B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scan.nextInt();
        }
        System.out.print(sum / n);
        scan.close();
    }
}