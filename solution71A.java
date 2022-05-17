
import java.util.Scanner;

public class solution71A {
	public static final void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();

		int len = txt.length();
		int count = 0;

		for (int i = 0; i < len; i++) {
			if (Character.isUpperCase(txt.charAt(i))) {
				count++;
			}

			if (count > (len / 2))
				System.out.println(txt.toUpperCase());
			else
				System.out.println(txt.toLowerCase());

			sc.close();

		}
	}
}