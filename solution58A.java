// Problem set 58A

import java.util.Scanner;

public class solution58A {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String matcher = "hello";

		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (count == matcher.length())
				break;

			if (input.charAt(i) == matcher.charAt(count))
				count++;
		}

		if (count >= 5)
			System.out.println("YES");
		else
			System.out.println("NO");
		scan.close();
	}
}
