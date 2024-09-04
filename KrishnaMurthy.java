import java.util.*;

public class KrishnaMurthy {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num");
    int n = sc.nextInt();
    int rem = 0;
    int f = 0;
    int c = n;
    // 124=> 1!+2!+4!
    while (n != 0) {
      rem = n % 10;
      f = f + fact(rem);
      n = n / 10;
    }
    System.out.println(f);
    if (f == c)
      System.out.println("YES");
    else
      System.out.println("NO");
  }

  private static int fact(int rem) {
    int f = 1;
    for (int i = 1; i <= rem; i++) {
      f = f * i;
    }
    return f;
  }
}
