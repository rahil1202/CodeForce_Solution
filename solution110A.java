import java.util.Scanner;

public class solution110A {

    public static void main(String[] args)

    {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        String result;
        int count = 0;
        // int len = String.valueOf(num).lenght();
        int len = 0;
        long temp = 1;
        while (temp <= num) {
            len++;
            temp *= 10;
        }

        for (int i = 0; i < len;) {
            int rem = num % 10;
            if (rem == 4 || rem == 7)
                count = 1;
            else
                count = -1;
            break;

        }

        if (num % 4 == 0 || num % 7 == 0)
            result = "YES";

        else if (count == -1)
            result = "NO";
        else
            result = "YES";

        System.out.println(result);
        ip.close();
    }
}