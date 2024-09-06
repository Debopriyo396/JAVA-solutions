
/*### Question:

**Problem Statement:**

You are given a string `s` where each character is either 'A', 'B', or a digit ('0'-'9'). The string represents a sequence of binary operations performed on the digits. Compute the result of the operations based on the following rules:

- If the character is 'A', perform a bitwise AND operation between the digits immediately before and after it.
- If the character is 'B', perform a bitwise OR operation between the digits immediately before and after it.
- If the character is neither 'A' nor 'B', perform a bitwise XOR operation between the digits immediately before and after it.

**Input:**

- A single string `s` (3 ≤ s.length ≤ 100) containing digits and the characters 'A' or 'B'. The string is guaranteed to have 'A' or 'B' at odd indices and digits at even indices.

**Output:**

- An integer representing the result of performing the specified bitwise operations according to the rules above.

**Example:**

**Input:**

`2A3B4`

**Output:**

`9`

**Explanation:**

For the input string `2A3B4`:

1. For the character 'A' at index 1: The operation is `2 & 3`, which results in `2`.
2. For the character 'B' at index 3: The operation is `3 | 4`, which results in `7`.

Adding these results gives `2 + 7 = 9`.*/

import java.util.Scanner;

public class binop {
    public static void main(String[] args) {
        int i = 0, ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        int n = s.length();

        for (i = 1; i < n - 1; i += 2) {
            char operation = s.charAt(i);
            int left = s.charAt(i - 1) - '0';
            int right = s.charAt(i + 1) - '0';

            if (operation == 'A') {
                ans += (left & right);
            } else if (operation == 'B') {
                ans += (left | right);
            } else {
                ans += (left ^ right);
            }
        }

        System.out.println("Result: " + ans);
    }
}
