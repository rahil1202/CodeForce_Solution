import java.util.Scanner;

public class solution1030A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        String flag = "False";

        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
            if (array[i] == 1)
                flag = "true";
            else
                continue;

        }
        if (flag == "true")
            System.out.println("HARD");
        else
            System.out.println("EASY");
        sc.close();
    }
}
