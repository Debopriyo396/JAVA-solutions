import java.util.Scanner;

public class SpecificNumber {
  public static void main(String[] args) {
    int i = 0, j = 0, max = 0, res = 0, n = 0, c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A: ");
    int a = sc.nextInt();
    System.out.println("Enter B: ");
    int b = sc.nextInt();
    for (i = a; i <= b; i++) {
      if (check(i)) {
        c++;
      }
    }
    System.out.println(c);
  }

  private static boolean check(int i) {
    int t = i, rem = 0;
    while (i > 0) {
      rem = i % 10;
      if (rem != 1 && rem != 4 && rem != 9) {
        return false;
      }
      i /= 10;
    }
    return true;
  }
}
