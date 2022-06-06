import java.util.*;

public class solution1441A {
	public static void main(String[] args) {
		try (var in = new Scanner(System.in)) {
			int t = in.nextInt();
			for (int l = 0; l < t; l++) {
				int n = in.nextInt();
				// var a = new int[n];
				int odd = 0;
				for (int i = 0; i < n; i++) {
					odd += in.nextInt() % 2;
				}

				System.out.println(Math.min(n - odd, odd));
			}
		}

	}
}