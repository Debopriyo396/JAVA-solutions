import java.util.Scanner;

public class dontContain3inDeciRep {
  public static void main(String[] args) {
    int i, j, res, s, c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int n = sc.nextInt();
    int t = n;
    for (i = 1; i <= n; i++) {
      if (check(i))
        c++;
    }
    System.out.println("No of elements not having with 3 in them : " + c);
  }

  private static boolean check(int i) {
    int t = i, rem = 0;
    while (t > 0) {
      rem = t % 10;
      if (rem == 3)
        return false;
      t /= 10;
    }
    return true;
  }
}
