/* ### Question:

**Problem Statement:**

Write a program to find and print the middle word(s) from a given sentence. If the sentence has an even number of words, exclude the middle two words from the result.

**Input:**

- A sentence containing multiple words.

**Output:**

- Print the sentence with the middle word(s) removed. If the number of words is odd, remove the middle word; if even, remove the two middle words.

**Example:**

**Input:**

```
Enter name: The quick brown fox jumps over the lazy dog
```

**Output:**

```
The quick fox jumps over the lazy dog
```

**Explanation:**

For the sentence `"The quick brown fox jumps over the lazy dog"`:
- The words are: `["The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"]`
- The total number of words is 9, which is odd. The middle word is `"fox"`.
- After removing `"fox"`, the remaining words are: `"The quick brown jumps over the lazy dog"`.*/

import java.math.*;
import java.util.*;

public class Middleword {
  public static void main(String[] args) {
    int i = 0, h = 0, e = 0, dq = 0;
    boolean iw = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    String s = sc.nextLine();
    s = " " + s;
    int n = s.length();
    String w = "";

    int start, j;
    int end = n;
    int c = 0;
    int nw = 0;
    for (i = 0; i < n; i++) {
      char ch = s.charAt(i);
      if (ch == ' ') {
        c++;
      }
    }
    String arr[] = new String[c];
    int k = 0;
    for (i = n - 1; i >= 0; i--) {
      char ch = s.charAt(i);
      w = "";
      if (ch == ' ') {
        start = (i + 1);
        for (j = start; j < end; j++) {
          w = w + s.charAt(j);
        }
        System.out.println("----" + w);
        arr[k++] = w;
        end = i;
      }
    }
    int z = arr.length;
    String r = "";
    for (int l = z - 1; l >= 0; l--) {
      if (l != (z / 2))
        r = r + " " + arr[l];
    }
    System.out.println(r);
  }
}
