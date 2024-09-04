import java.util.Scanner;

public class CaseAccCase {
  public static void main(String[] args) {
    int i = 0, j = 0, c = 0, max = 0, min = 0, l = 0;
    char ch = ' ';
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    String s = sc.nextLine();
    int n = s.length();
    for (i = 0; i < n; i++) {
      ch = s.charAt(i);
      if ((int) ch >= 65 && (int) ch <= 90)
        c++;
      else
        l++;
    }
    if (l > c)
      lower(s, n);
    else
      upper(s, n);
  }

  private static void lower(String s, int n) {
    int i;
    String w = " ";
    char ch = ' ';
    for (i = 0; i < n; i++) {
      ch = s.charAt(i);
      if ((int) ch >= 65 && (int) ch <= 90)
        w = w + (char) (ch + 32);
      else
        w = w + ch;
    }
    System.out.println(w);
  }

  private static void upper(String s, int n) {
    int i;
    String w = "";
    char ch = ' ';
    for (i = 0; i < n; i++) {
      ch = s.charAt(i);
      if ((int) ch >= 97 && (int) ch <= 122)
        w = w + (char) (ch - 32);
      else
        w = w + ch;
    }
    System.out.println(w);
  }
}
