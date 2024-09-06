//SUM BY RECURSION :)
public class SumRec {
  public static void main(String[] args) {
    int n = 10;
    int ss = sum(n);
    System.out.println(ss);
  }

  private static int sum(int n) {
    int i = 1, s = 0;
    if (n < 1)
      return 0;
    return n + sum(n - 1);
  }
}
