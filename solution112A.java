
import java.util.Scanner;

public class solution112A { // PROBLEMSET 112A

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String first1 = sc.next();
        String second1 = sc.next();

        String first = first1.toLowerCase();
        String second = second1.toLowerCase();

        // System.out.println(first.compareTo(second));

        if (first.compareTo(second) == 0) {
            System.out.println("0");
        }
        if (first.compareTo(second) > 0) {
            System.out.println("1");
        }
        if (first.compareTo(second) < 0) {
            System.out.println("-1");

        }
        sc.close();
    }
}
