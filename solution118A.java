import java.util.Scanner;

public class solution118A {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        // char[] v = new char[100];
        // char[] v = { 'a', 'e', 'i', 'o', 'u', 'y' };
        String s = ip.next().toLowerCase().replaceAll("[aeiouyAEIOUY]", "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(".");
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
        ip.close();
    }
}