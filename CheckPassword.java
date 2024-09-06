
/*### Question:

**Problem Statement:**

You need to validate a password based on specific criteria. The password must meet the following requirements:

1. It must be at least a given minimum length.
2. It must not start with a digit.
3. It must contain at least one uppercase letter, one digit, and one special character (not a letter or digit).
4. It must not contain spaces or the `+` character.

Determine if a password meets these criteria.

**Input:**

- A string `s` (1 ≤ length of `s` ≤ 1000) representing the password.
- An integer `m` representing the minimum required length of the password.

**Output:**

- Print `"PASSWORD VALID"` if the password meets all the criteria.
- Print `"NOT VALID"` if the password does not meet the criteria.

**Example:**

**Input:**

`P@ssw0rd 8`

**Output:**

`PASSWORD VALID`

**Explanation:**

For the input password `P@ssw0rd` and minimum length `8`:

1. The password is `P@ssw0rd`, which has a length of `8` (equal to the minimum required length).
2. It does not start with a digit.
3. It contains at least one uppercase letter (`P`), one digit (`0`), and one special character (`@`).
4. It does not contain spaces or the `+` character.

Therefore, the password meets all criteria and is considered valid. */
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
