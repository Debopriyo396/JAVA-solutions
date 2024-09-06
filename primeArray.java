
/* ### Question:

**Problem Statement:**

Write a program to count the number of prime and non-prime numbers in an array.

**Input:**

1. An integer `n` representing the number of elements in the array.
2. An array of `n` integers.

**Output:**

- Print the count of prime numbers.
- Print the count of non-prime numbers.

**Example:**

**Input:**

```
Enter limit
5
Enter elements
2
3
4
5
6
```

**Output:**

```
PRIMES:3
not PRIMES:2
```

**Explanation:**

In the array `[2, 3, 4, 5, 6]`, the prime numbers are `2`, `3`, and `5`, totaling 3 primes. The non-prime numbers are `4` and `6`, totaling 2 non-primes.*/
import java.util.Scanner;

public class primeArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter limit");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int p = 0, np = 0;
    for (int i = 0; i < n; i++) {
      if (isPrime(a[i])) {
        p++;
      } else
        np++;
    }
    System.out.println("PRIMES:" + p);
    System.out.println("not PRIMES:" + np);
  }

  private static boolean isPrime(int n) {
    for (int i = 2; i*i <= n; i++) {
      if (n % i == 0)
        return false;
    }
    if (n == 1)
      return false;
    return true;
  }
}
