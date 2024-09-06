
/* ### Question:

**Problem Statement:**

Write a program that performs the following tasks:

1. Given a string and a character, find the most frequent lowercase letter in the string.
2. Replace all occurrences of this most frequent letter with the given character.
3. Output the resulting string.

**Input:**

- A string `s` consisting of lowercase letters and possibly other characters.
- A single lowercase character `ch`.

**Output:**

- The modified string with all occurrences of the most frequent lowercase letter replaced by `ch`.

**Example:**

**Input:**

```
Enter String: abacabadabacaba
Enter character: x
```

**Output:**

```
xxxcxxxdxxx
```

**Explanation:**

In the string "abacabadabacaba":
- The letter 'a' is the most frequent lowercase letter (appears 8 times).
- Replacing all occurrences of 'a' with 'x' gives "xxxcxxxdxxx".*/
import java.util.*;

public class freq {
    public static void main(String[] args) {
        int i = 0, c = 0, max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);
        int n = s.length();
        int h[] = new int[26];
        String ans = "";

        // Count the frequency of each lowercase letter
        for (i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') { // Ensure the character is within 'a' to 'z'
                h[currentChar - 'a']++;
            }
        }

        // Find the most frequent character
        for (i = 0; i < 26; i++) {
            if (h[i] > max) {
                max = h[i];
                c = i;
            }
        }

        char r = (char) (c + 'a');

        // Replace the most frequent character with the specified character
        for (i = 0; i < n; i++) {
            if (s.charAt(i) == r) {
                ans = ans + ch;
            } else {
                ans = ans + s.charAt(i);
            }
        }

        System.out.println("The result: " + ans);
    }
}
