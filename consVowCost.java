
/*### Question:

**Problem Statement:**

Given a string, calculate the total cost of all consonants in the string. The cost of a consonant is defined as the minimum distance between the consonant and any of the vowels (`a, e, i, o, u`).

**Input:**

- A string `s`.

**Output:**

- The total cost of all consonants in the string.

**Example:**

**Input:**

```
hello
```

**Output:**

```
7
```

**Explanation:**

For the input string `hello`:

1. The consonants are `h`, `l`, and `l`.
2. The cost of `h` is `1` (minimum distance to vowel `i`).
3. The cost of `l` is `1` (minimum distance to vowel `i`).
4. The total cost is `1 + 1 + 1 = 3`.

Thus, the output is `3`. */

import java.util.Scanner;

public class consVowCost {
  public static void main(String[] args) {
    int i = 0, j = 0, max = Integer.MIN_VALUE, min = 0, asc = 0, sum = 0, cost = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String s = sc.nextLine();
    int n = s.length();
    String ans = "";
    for (i = 0; i < n; i++) {
      if (isVowel(s.charAt(i)) == false) {
        char c = s.charAt(i);
        c = Character.toLowerCase(c);
        sum = checkdiff(c);
        cost += sum;
      }
    }
    System.out.println(cost);
  }

  public static int checkdiff(char c) {
    int min = Integer.MAX_VALUE;
    c = Character.toLowerCase(c);
    char[] v = { 'a', 'e', 'i', 'o', 'u' };
    for (int i = 0; i < 5; i++) {
      if (min > Math.abs(c - v[i]))
        min = Math.abs(c - v[i]);
    }
    return min;
  }

  public static boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
      return true;
    return false;
  }

}
