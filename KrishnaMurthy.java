
/* ### Question:

**Problem Statement:**

Write a program to determine if a given number is a *Krishna Murthy Number*. A Krishna Murthy Number is a number where the sum of the factorials of its digits is equal to the number itself.

**Input:**

- An integer `n`.

**Output:**

- Print the sum of the factorials of the digits of `n`.
- Print `"YES"` if the sum equals the original number `n`, otherwise print `"NO"`.

**Example:**

**Input:**

```
enter num
145
```

**Output:**

```
145
YES
```

**Explanation:**

For the number `145`:
- The factorial of digits are: `1! = 1`, `4! = 24`, `5! = 120`.
- The sum of these factorials is `1 + 24 + 120 = 145`, which equals the original number `145`.
- Thus, `145` is a Krishna Murthy Number.*/
import java.util.*;

public class KrishnaMurthy {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num");
    int n = sc.nextInt();
    int rem = 0;
    int f = 0;
    int c = n;
    // 124=> 1!+2!+4!
    while (n != 0) {
      rem = n % 10;
      f = f + fact(rem);
      n = n / 10;
    }
    System.out.println(f);
    if (f == c)
      System.out.println("YES");
    else
      System.out.println("NO");
  }

  private static int fact(int rem) {
    int f = 1;
    for (int i = 1; i <= rem; i++) {
      f = f * i;
    }
    return f;
  }
}
