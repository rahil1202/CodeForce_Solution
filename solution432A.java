import java.util.*;

public class solution432A{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int temp, count = 0;
        for (int i = 0; i < n; i++) {
            temp = scan.nextInt();
            if (temp <= (5 - k))
                count++;
        }
        System.out.println(count / 3);
        scan.close();
    }
}