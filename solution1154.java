import java.util.*;;

public class solution1154 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int x = arr[3] - arr[0];
        int y = arr[3] - arr[1];
        int z = arr[3] - arr[2];
        System.out.println(x + " " + y + " " + z);
        sc.close();

    }
}