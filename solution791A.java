// PROBLEM 791A

import java.util.Scanner;

public class solution791A {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt(), b = ip.nextInt();
        int count = 0;
        while (a <= b) {

            a *= 3;
            b *= 2;
            ++count;

        }

        System.out.println(count);
        ip.close();

    }

}