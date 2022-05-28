import java.util.Scanner;

public class solution431A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        for (int i = 1; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        String st = sc.next();
        char ch[] = st.toCharArray();
        for (int i = 0; i < st.length(); i++) {
            if (ch[i] == '1')
                sum += arr[1];
            if (ch[i] == '2')
                sum += arr[2];
            if (ch[i] == '3')
                sum += arr[3];
            if (ch[i] == '4')
                sum += arr[4];
            else
                continue;
        }
        System.out.println(sum);
        sc.close();
    }
}