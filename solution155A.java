
import java.util.Scanner;

public class solution155A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int max = sc.nextInt();
		int min = max;
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			if (min > a) {
				min = a;
				count++;
			} else if (max < a) {
				max = a;
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
