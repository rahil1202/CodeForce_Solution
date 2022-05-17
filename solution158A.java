import java.util.Scanner;
// PROBLEM SET 158A

public class solution158A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int arr[] = new int[100];
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            if (arr[i] > 0 && arr[i] >= arr[k - 1])
                count++;

        System.out.println(count);
        sc.close();
    }
}
