
/***Question:**

You are given an integer `n`. The task is to rearrange the bits of its binary representation such that all 1s come before all 0s and then convert this new binary representation back to its decimal form.

Write a program to perform the following steps:
1. Convert the integer `n` to its binary representation.
2. Rearrange the bits of the binary representation so that all 1s appear before all 0s.
3. Convert this new binary representation back to its decimal form and output the result.

**Input:**
- An integer `n`.

**Output:**
- The decimal value of the rearranged binary representation.

**Example:**

**Input:**
```
10
```

**Output:**
```
6
```

**Explanation:**

1. Binary representation of `10` is `1010`.
2. Rearranging the bits to get all 1s before all 0s gives `1100`.
3. Decimal value of `1100` is `12`. */

import java.util.Scanner;

public class RearrangeBits { // 10==>1010 == 11==> 3
  public static void main(String[] args) {
    int i = 0, j = 0, c = 0, max = 0, min = 0, l = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int n = sc.nextInt();
    toBin(n);
  }

  private static void toBin(int n) {
    int i, s = 0, d = 0, r = 0;
    while (n > 0) {
      d = n % 2;
      s = (s * 10) + d;
      n /= 2;
    }
    while (s > 0) {
      d = s % 10;
      if (d == 1)
        r = r * 10 + d;
      s /= 10;
    }
    toDecimal(r);
  }

  private static void toDecimal(int r) {
    int a = 0, d = 0, i = 1;
    while (r > 0) {
      d = r % 10;
      a = a + (int) Math.pow(i, d);
      r /= 10;
      i = i * 2;
    }
    System.out.println(a);
  }
}