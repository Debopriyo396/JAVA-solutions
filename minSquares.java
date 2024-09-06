
/* ### Question:

**Problem Statement:**

Write a program to find the minimum number of perfect squares that sum up to a given number `n`. The function should return the smallest number of perfect squares needed.

**Input:**

1. An integer `n` representing the number for which we need to find the minimum number of perfect squares.

**Output:**

- Print the minimum number of perfect squares that sum up to `n`.

**Example:**

**Input:**

```
Enter number: 12
```

**Output:**

```
3
```

**Explanation:**

For the number `12`, the minimum number of perfect squares that sum up to `12` is `3` (i.e., `4 + 4 + 4` which is `2^2 + 2^2 + 2^2`).*/
import java.util.Scanner;

public class minSquares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int n = sc.nextInt();
    int s = msq(n);
    System.out.println(s);
  }

  public static int msq(int n) {
    int r=0, mc=0;
    if (n <= 0) {
      return 0;
    }
    mc=n;
    for (int i = 1; i * i <= n; i++) {
       r=n-i*i;
       mc= Math.min(mc,1+msq(r));
    }
    return mc;
  }
}
