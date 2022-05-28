import java.util.*;

public class solution1551A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int data = scanner.nextInt();
            int temp1 = data / 3;
            int temp2 = data % 3;
            if (temp2 >= 2)
                System.out.println(temp1 + temp2 % 2 + " " + (temp1 + 1));
            else
                System.out.println(temp1 + temp2 + " " + temp1);
        }
        scanner.close();
    }

}
