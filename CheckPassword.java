import java.util.Scanner;

public class CheckPassword {
  public static void main(String[] args) {
    int i = 0, j = 0, c = 0, max = 0, min = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    String s = sc.nextLine();
    int n = s.length();
    System.out.println("Enter min length of pw: ");
    int m = sc.nextInt();
    int r = checkp(s, n, m);
    if (r != -1)
      System.out.println("PASSWORD VALID");
    else
      System.out.println("NOT VALID");
  }

  private static int checkp(String s, int n, int m) {
    int i = 0, u = 0, d = 0, ss = 0;
    if (n < m)
      return -1;
    if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
      return -1;
    for (i = 0; i < n; i++) {
      char c = s.charAt(i);
      if (c >= 'A' && c <= 'Z')
        u++;
      else if (c >= '0' && c <= '9')
        d++;
      else if (c == '+' || c == ' ')
        return -1;
      else if (isspecial(c))
        ss++;
    }
    if (u > 0 && d > 0 && ss > 0)
      return 1;
    else
      return -1;
  }

  private static boolean isspecial(char c) {
    if (c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c >= 'a' && c <= 'z')
      return false;
    else
      return true;
  }
}
