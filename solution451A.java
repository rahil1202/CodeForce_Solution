import java.util.*;

public class solution451A {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        System.out.println(Math.min(n, m) % 2 == 0 ? "Malvika" : "Akshat");
        obj.close();
    }
}