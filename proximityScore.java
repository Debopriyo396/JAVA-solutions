
/***Question:**

You are given two strings, `s1` and `s2`. Your task is to compute a "proximity score" between these two strings. The score is calculated based on the following rules:

1. For each character position where both strings have the same character, add 2 to the score.
2. For each character in `s1` that appears anywhere in `s2` (excluding the matched positions), add 1 to the score.

Write a program to calculate this "proximity score" based on the provided strings.

**Input:**
- The first line contains the string `s1`.
- The second line contains the string `s2`.

**Output:**
- Print the proximity score.

**Example:**

**Input:**
```
amitabh
ajitabh
```

**Output:**
```
12
```

**Explanation:**

- Comparing characters at the same positions:
  - `a` (s1[0]) == `a` (s2[0]) → +2
  - `i` (s1[1]) == `i` (s2[1]) → +2
  - `t` (s1[2]) == `t` (s2[2]) → +2
  - `a` (s1[3]) == `a` (s2[3]) → +2
  - `b` (s1[4]) == `b` (s2[4]) → +2
  - `h` (s1[5]) == `h` (s2[5]) → +2

- Additional matches:
  - `a` (s1[0]) appears again in s2 at positions 3, 6 → +1 +1
  - `i` (s1[1]) appears again in s2 at positions 4 → +1
  - `t` (s1[2]) appears again in s2 at positions 5 → +1

Total proximity score = 12. */
import java.util.Scanner;

public class ProximityScore {
    public static void main(String[] args) {
        int i, j, c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name 1: ");
        String s1 = sc.nextLine();

        System.out.println("Enter name 2: ");
        String s2 = sc.nextLine();

        int n1 = s1.length();
        int n2 = s2.length();

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);

        for (i = 0; i < min; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                c += 2;
            }
            for (j = 0; j < max; j++) {
                if (i != j && i < n1 && j < n2 && s1.charAt(i) == s2.charAt(j)) {
                    c++;
                }
            }
        }

        System.out.println("Proximity score: " + c);

        sc.close();
    }
}
