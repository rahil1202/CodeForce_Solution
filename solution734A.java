import java.util.Scanner;

public class solution734A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0, flag = 0;
        int n = sc.nextInt();
        String txt = sc.next();
        char ch[] = txt.toCharArray();

        for (int i = 0; i < n; i++) {
            if (ch[i] == 'A')
                ++count;
            else
                ++flag;
        }

        if (count > flag)
            System.out.println("Anton");
        else if (flag > count)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
        sc.close();

    }
}