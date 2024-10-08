

/*### Question:

**Problem Statement:**

Given a sentence, calculate the "Difficulty Quotient" (DQ) based on the following rules:

1. Each word in the sentence is analyzed:
   - If a word has more consonants than vowels, it is classified as a "hard" word.
   - If a word has three consecutive consonants, it is classified as a "hard" word.
   - All other words are classified as "easy" words.

2. Calculate the Difficulty Quotient using the formula:
   \[
   \text{DQ} = (5 \times \text{number of hard words}) - (2 \times \text{number of easy words})
   \]

**Definitions:**
- A consonant is any alphabetic character that is not a vowel.
- Vowels are `a, e, i, o, u`.

**Input:**

- A sentence as a string `s`.

**Output:**

- The Difficulty Quotient (DQ) as an integer.

**Example:**

**Input:**

```
hello world this is a test
```

**Output:**

```
3
```

**Explanation:**

For the input sentence `"hello world this is a test"`:
- Words: `"hello"`, `"world"`, `"this"`, `"is"`, `"a"`, `"test"`
  - `"hello"`: 3 consonants, 2 vowels (hard)
  - `"world"`: 4 consonants, 1 vowel (hard)
  - `"this"`: 3 consonants, 1 vowel (hard)
  - `"is"`: 1 consonant, 1 vowel (easy)
  - `"a"`: 0 consonants, 1 vowel (easy)
  - `"test"`: 3 consonants, 1 vowel (hard)
- Number of hard words = 4
- Number of easy words = 2
- DQ = (5 * 4) - (2 * 2) = 20 - 4 = 16 */
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
