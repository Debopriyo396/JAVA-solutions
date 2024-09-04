import java.util.Scanner;

public class BalanceFruits {
  public static void main(String[] args) {
    int i = 0, j = 0, max = 0, res = 0, n = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A: ");
    int a = sc.nextInt();
    System.out.println("Enter M: ");
    int m = sc.nextInt();
    System.out.println("Enter C: ");
    int c = sc.nextInt();
    if (a > m) {
      c -= (a - m);
    } else if (m > a) {
      c -= (m - a);
    }
    System.out.println(c);
  }

}
