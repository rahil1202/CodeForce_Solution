import java.util.Scanner;

public class solution785A {

    public static int fun(String s) {
        int ans = 0;
        switch (s) {
            case "Tetrahedron":
                ans = 4;
                break;
            case "Cube":
                ans = 6;
                break;
            case "Octahedron":
                ans = 8;
                break;
            case "Dodecahedron":
                ans = 12;
                break;
            case "Icosahedron":
                ans = 20;
                break;
            default:
                ans = 0;
        }

        return ans;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        while (n-- > 0) {
            String st = sc.next();
            sum += fun(st);
        }
        System.out.println(sum);
        sc.close();
    }
}