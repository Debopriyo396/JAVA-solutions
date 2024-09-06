/*### Question:

**Problem Statement:**

You need to check if a given word `t` is present in a given sentence `s`. Implement a brute force method to determine if the word `t` appears as a substring within the sentence `s`.

**Input:**

- A string `s` representing the sentence.
- A string `t` representing the word to search for within the sentence.

**Output:**

- Print `"YES, the word 't' is present in the sentence."` if the word `t` is found in the sentence `s`.
- Print `"NO, the word 't' is not present in the sentence."` if the word `t` is not found in the sentence `s`.

**Example:**

**Input:**

```
The quick brown fox jumps over the lazy dog
fox
```

**Output:**

```
YES, the word 'fox' is present in the sentence.
```

**Explanation:**

For the input sentence `The quick brown fox jumps over the lazy dog` and the word `fox`:

1. The word `fox` is checked against every possible substring of length equal to the word `t` within the sentence `s`.
2. The substring `fox` matches the word `t`, so it is present in the sentence.

Therefore, the output is `YES, the word 'fox' is present in the sentence.` */


import java.util.Scanner;

public class CheckWordPresBruteForce {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sentence:");
    String s = sc.nextLine();
    System.out.println("Enter word:");
    String t = sc.next();

    boolean found = false;
    int n = s.length();
    int m = t.length();

    for (int i = 0; i <= n - m; i++) { // Traverse the string `s`
      int j;
      for (j = 0; j < m; j++) { // Compare substring of length `m` with the word `t`
        if (s.charAt(i + j) != t.charAt(j)) {
          break; // If characters don't match, break and check the next substring
        }
      }
      if (j == m) { // If the loop completed, word `t` is found
        found = true;
        break;
      }
    }

    if (found) {
      System.out.println("YES, the word '" + t + "' is present in the sentence.");
    } else {
      System.out.println("NO, the word '" + t + "' is not present in the sentence.");
    }

    sc.close();
  }
}
