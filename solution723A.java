import java.util.*;

public class solution723A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int dis = (arr[1] - arr[0]) + (arr[2] - arr[1]);
        System.out.println(dis);
        sc.close();
    }
}