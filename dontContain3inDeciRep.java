

/* ### Question:

**Problem Statement:**

Write a program to count how many integers from 1 to `n` do not contain the digit '3' in their decimal representation.

**Input:**

- An integer `n` representing the range from 1 to `n`.

**Output:**

- An integer representing the number of elements between 1 and `n` that do not contain the digit '3'.

**Example:**

**Input:**

```
20
```

**Output:**

```
17
```

**Explanation:**

For the input value `n = 20`:
- Numbers from 1 to 20 that do not contain the digit '3': 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20.
- Total count: 17.*/
import java.util.Scanner;

public class dontContain3inDeciRep {
  public static void main(String[] args) {
    int i, j, res, s, c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int n = sc.nextInt();
    int t = n;
    for (i = 1; i <= n; i++) {
      if (check(i))
        c++;
    }
    System.out.println("No of elements not having with 3 in them : " + c);
  }

  private static boolean check(int i) {
    int t = i, rem = 0;
    while (t > 0) {
      rem = t % 10;
      if (rem == 3)
        return false;
      t /= 10;
    }
    return true;
  }
}
