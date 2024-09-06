
/* ### Question:

**Problem Statement:**

Write a program to find the number between two given integers `A` and `B` (inclusive) that has the maximum number of 2's in its prime factorization. If there are multiple numbers with the same maximum count, return the smallest one.

**Input:**

- Two integers `A` and `B` where `A ≤ B`.

**Output:**

- An integer representing the number with the maximum number of 2's in its factorization.

**Example:**

**Input:**

```
5
10
```

**Output:**

```
8
```

**Explanation:**

For the range `[5, 10]`, the prime factorizations of the numbers are:
- 5: \( 5^1 \) (0 factors of 2)
- 6: \( 2 \times 3 \) (1 factor of 2)
- 7: \( 7 \) (0 factors of 2)
- 8: \( 2^3 \) (3 factors of 2)
- 9: \( 3^2 \) (0 factors of 2)
- 10: \( 2 \times 5 \) (1 factor of 2)

The number with the maximum number of 2's in its factorization is `8`, which has 3 factors of 2.*/

import java.util.Scanner;

public class Exponent2 {
  public static void main(String[] args) {
    int i = 0, max = 0, res = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter A: ");
    int a = sc.nextInt();

    System.out.println("Enter B: ");
    int b = sc.nextInt();

    for (i = a; i <= b; i++) {
      if (max < pfacto(i)) {
        max = pfacto(i);
        res = i;
      }
    }

    System.out.println("The number with max 2's in its factorization is: " + res);
    sc.close();
  }

  static int pfacto(int i) {
    int c = 0;
    while (i > 0 && i % 2 == 0) {
      i = i / 2;
      c++;
    }
    return c;
  }
}
