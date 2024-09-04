import java.util.Scanner;

public class RearrangeBits { // 10==>1010 == 11==> 3
  public static void main(String[] args) {
    int i = 0, j = 0, c = 0, max = 0, min = 0, l = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int n = sc.nextInt();
    toBin(n);
  }

  private static void toBin(int n) {
    int i, s = 0, d = 0, r = 0;
    while (n > 0) {
      d = n % 2;
      s = (s * 10) + d;
      n /= 2;
    }
    while (s > 0) {
      d = s % 10;
      if (d == 1)
        r = r * 10 + d;
      s /= 10;
    }
    toDecimal(r);
  }

  private static void toDecimal(int r) {
    int a = 0, d = 0, i = 1;
    while (r > 0) {
      d = r % 10;
      a = a + (int) Math.pow(i, d);
      r /= 10;
      i = i * 2;
    }
    System.out.println(a);
  }
}