import java.util.Scanner;

public class solution466A {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, m, a, b;
        double min;
        n = in.nextInt();
        m = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        int op1 = (n * a);
        min = op1;
        double op2 = ((n / m)) * b;
        double temp = (double) n / m;
        if (Math.ceil(temp) != temp)
            op2 += b;
        if (min > op2)
            min = op2;
        op1 = 0;
        op1 += ((n / m) * b);
        op1 += (n % m) * a;
        if (op1 < min)
            min = op1;
        System.out.println((int) min);
        in.close();
    }
}