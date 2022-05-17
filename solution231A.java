import java.util.Scanner;

//PROBLEM SET 231A
class solution231A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            sum = x + y + z;

            if (sum > 1)
                count++;
        }

        System.out.println(count);
        scan.close();

    }
}