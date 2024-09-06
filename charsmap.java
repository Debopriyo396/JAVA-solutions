
/*### Question:

**Problem Statement:**

You are given two strings `s1` and `s2`, each containing only lowercase letters. Determine if the two strings are anagrams of each other. Two strings are considered anagrams if they contain the same characters with the same frequencies.

**Input:**

- Two strings `s1` and `s2` (1 ≤ length of `s1`, `s2` ≤ 1000), containing only lowercase letters.

**Output:**

- Print `"YES"` if the two strings are anagrams of each other.
- Print `"NO"` if they are not.

**Example:**

**Input:**

`listen silent`

**Output:**

`YES`

**Explanation:**

For the input strings `listen` and `silent`:

1. Count the frequency of each character in both strings:
   - For `listen`: `l:1, i:1, s:1, t:1, e:1, n:1`
   - For `silent`: `s:1, i:1, l:1, e:1, n:1, t:1`

2. Both strings have the same character frequencies, so they are anagrams.

Therefore, the output is `YES`. */
import java.util.Scanner;

public class charsmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name 1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter name 2: ");
        String s2 = sc.nextLine();
        int n1 = s1.length(), n2 = s2.length();
        if (n1 != n2) {
            System.out.println("NO");
            return;
        }
        int h1[] = new int[26];
        int h2[] = new int[26];
        for (int i = 0; i < n1; i++) {
            h1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n2; i++) {
            h2[s2.charAt(i) - 'a']++;
        }
        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (h1[i] != h2[i]) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
