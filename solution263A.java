import java.util.Scanner;

public class solution263A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int pos1 = 0;
        int pos2 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    pos1 = i + 1;
                    pos2 = j + 1;
                } else
                    continue;
            }

        }
        // System.out.println(pos1 + " " + pos2);

        pos1 -= 3;
        pos2 -= 3;

        // System.out.println(pos1 + " " + pos2);

        int count = Math.abs(pos1) + Math.abs(pos2);
        System.out.println(count);

        sc.close();
    }
}