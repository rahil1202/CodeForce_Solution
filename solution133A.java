import java.util.Scanner;

public class solution133A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        // char ch[] = p.toCharArray();
        if (p.contains("H") || p.contains("Q") || p.contains("9"))
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();

    }
}