public class ReverseNo {
  public static void main(String[] args) {
    int n = 31226;
    int d = 0, s = 0, r = 0, ans = 0;
    while (n > 0) {
      d = n % 10;
      s = (s*10) + d;
      n = n / 10;
    }
    System.out.println(s);
  }
}
