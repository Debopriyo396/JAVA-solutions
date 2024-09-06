
/*### Question:

**Problem Statement:**

Write a program to find the product of the smallest and the second smallest numbers in an array and compare it with a given sum. If the product is less than the sum, print the product; otherwise, print `0`.

**Input:**

1. An integer `n` representing the number of elements in the array.
2. An integer `s` representing the sum to compare with.
3. An array of `n` integers.

**Output:**

- Print the product of the smallest and second smallest numbers if it is less than the given sum.
- Print `0` if the product is greater than or equal to the sum.

**Example:**

**Input:**

```
Enter size
5
Enter sum
10
Enter elements
4
5
2
9
7
```

**Output:**

```
8
```

**Explanation:**

In the array `[4, 5, 2, 9, 7]`, the smallest number is `2` and the second smallest number is `4`. Their product is `2 * 4 = 8`, which is less than the given sum `10`, so the output is `8`. */
import java.util.Scanner;
public class ProductSmallestPair {

  public static void main(String[] args) {
    int i, c = 0, f = 0, d = 0, nd = 0, min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int n = sc.nextInt();
    System.out.println("Enter sum");
    int s = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      if (a[i] <= min) {
        smin = min;
        min = a[i];
      }
      if (a[i] > min && a[i] < smin) {
        smin = a[i];
      }
    }
    d = min * smin;
    if (d < s)
      System.out.println(d);
    else
      System.out.println(0);
  }
}