// 96A - Football

import java.util.Scanner;

public class solution96A {
	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int counter = 1;
		char curr = s.charAt(0);

		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != curr) {
				counter = 1;
				curr = c;
			} else {
				counter++;
				if (counter == 7)
					break;
			}
		}

		String output = (counter >= 7) ? "YES" : "NO";
		System.out.println(output);
		sc.close();
	}
}