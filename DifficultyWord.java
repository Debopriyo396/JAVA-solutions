import java.util.Scanner;

public class DifficultyWord {
  public static void main(String[] args) {
    int i = 0, h = 0, e = 0, dq = 0;
    boolean iw = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    String s = sc.nextLine();
    s = s + " ";
    int n = s.length();
    String w = "";
    for (i = 0; i < n; i++) {
      char ch = s.charAt(i);
      if (ch != ' ') {
        w += ch;
        iw = true;
      } else {
        if (iw) {
          if (check(w) == true || cons(w) == true) {
            h++;
          } else {
            e++;
          }
          w = "";
        }
      }
      iw = false;
    }
    dq = (5 * h) - (2 * e);
    System.out.println("Difficulty Quotient: " + dq);
  }

  public static boolean check(String w) {
    int c = 0, v = 0;
    for (int k = 0; k < w.length(); k++) {
      char ch = w.charAt(k);
      if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
        c++;
      } else
        v++;
    }
    if (c > v)
      return true;
    else
      return false;
  }

  public static boolean cons(String w) {
    for (int k2 = 0; k2 < w.length() - 2; k2++) {// debopriyo
      if (checkL(w.charAt(k2)) && checkL(w.charAt(k2 + 1)) && checkL(w.charAt(k2 + 2))) {//
        return true;
      } else
        continue;
    }
    return false;
  }

  private static boolean checkL(char ch) {
    if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
      return true;
    else
      return false;

  }
}
