import java.util.*;

public class solution703A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int m_count = 0;
        int c_count = 0;
        while (round-- > 0) {
            int m = sc.nextInt(), c = sc.nextInt();
            if (m > c)
                m_count++;
            else if (m < c)
                c_count++;
            else
                continue;
        }
        if (m_count > c_count)
            System.out.println("Mishka");
        else if (m_count < c_count)
            System.out.println("Chris");
        else
            System.out.println("Friendship is magic!^^");
        sc.close();

    }
}