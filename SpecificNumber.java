
/***Question:**

Write a program that counts the number of integers within a given range [A, B] whose digits are only 1, 4, or 9.

**Input:**
- Two integers A and B, where A ≤ B.

**Output:**
- The count of numbers between A and B (inclusive) where all digits are either 1, 4, or 9.

**Example:**

**Input:**
```
1
20
```

**Output:**
```
3
```

**Explanation:**
- The numbers within the range that contain only the digits 1, 4, or 9 are 1, 4, and 9. Thus, the count is 3. */
import java.util.Scanner;

public class SpecificNumber {
  public static void main(String[] args) {
    int i = 0, j = 0, max = 0, res = 0, n = 0, c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A: ");
    int a = sc.nextInt();
    System.out.println("Enter B: ");
    int b = sc.nextInt();
    for (i = a; i <= b; i++) {
      if (check(i)) {
        c++;
      }
    }
    System.out.println(c);
  }

  private static boolean check(int i) {
    int t = i, rem = 0;
    while (i > 0) {
      rem = i % 10;
      if (rem != 1 && rem != 4 && rem != 9) {
        return false;
      }
      i /= 10;
    }
    return true;
  }
}
