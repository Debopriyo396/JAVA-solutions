
/*### Question:

**Problem Statement:**

Given two integers `n` and `m`, calculate the difference between the sum of integers from 1 to `m` that are not divisible by 4 and the sum of integers from 1 to `m` that are divisible by 4.

**Input:**

- An integer `n` (not used in the solution).
- An integer `m` representing the range from 1 to `m`.

**Output:**

- The difference `s` as an integer.

**Example:**

**Input:**

```
5
10
```

**Output:**

```
-15
```

**Explanation:**

For the input values `n = 5` and `m = 10`:
- Sum of integers from 1 to 10 that are divisible by 4: 4 + 8 = 12
- Sum of integers from 1 to 10 that are not divisible by 4: 1 + 2 + 3 + 5 + 6 + 7 + 9 + 10 = 43
- Difference `s` = 43 - 12 = 31 */
import java.util.Scanner;

public class DiffSumDivFour {
  public static void main(String[] args) {
    int i, s = 0, c = 0, f = 0, d = 0, nd = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();
    System.out.println("Enter m");
    int m = sc.nextInt();
    for (i = 1; i <=m; i++) {
      if (i % 4 == 0)
        d+= i;
      else
        nd+= i;
    }
    s = nd - d;
    System.out.println(s);
  }
}
