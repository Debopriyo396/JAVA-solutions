
/*### Question:

**Problem Statement:**

You are given a string `s` which contains a mix of uppercase and lowercase letters. Your task is to determine whether there are more lowercase or uppercase letters in the string. Based on this, convert the entire string to either all lowercase or all uppercase letters:

- If there are more lowercase letters, convert the string to all lowercase.
- If there are more uppercase letters (or if they are equal), convert the string to all uppercase.

**Input:**

- A single string `s` (1 ≤ length of `s` ≤ 1000) containing letters (both uppercase and lowercase).

**Output:**

- A single string converted to either all lowercase or all uppercase based on the condition above.

**Example:**

**Input:**

`HelloWORLD`

**Output:**

`HELLOWORLD`

**Explanation:**

For the input string `HelloWORLD`:

1. Count the number of uppercase and lowercase letters:
   - Uppercase: `H`, `W`, `O`, `R`, `L`, `D` (6 uppercase letters)
   - Lowercase: `e`, `l`, `l`, `o`, `r`, `l`, `d` (7 lowercase letters)

2. Since there are more lowercase letters, convert the entire string to lowercase.

So, the output is `helloworld`. */
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
