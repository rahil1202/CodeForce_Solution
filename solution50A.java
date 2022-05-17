import java.util.Scanner;

// PROBLEM SET 50A
class solution50A {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
      int space = m * n;
      int number = space / 2;
      System.out.println(number);
      sc.close();

   }

}