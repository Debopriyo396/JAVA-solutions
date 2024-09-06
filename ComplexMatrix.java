
/*### Question:

**Problem Statement:**

You are given an array of integers. Your task is to separate the array into two arrays: one containing all the even numbers and one containing all the odd numbers. Then, find the second largest number in each of these arrays and return their sum.

**Input:**

- An integer `n`, the number of elements in the array.
- An array of `n` integers.

**Output:**

- The sum of the second largest even number and the second largest odd number.

**Example:**

**Input:**

```
7
1 2 3 4 5 6 7
```

**Output:**

```
9
```

**Explanation:**

For the input array `[1, 2, 3, 4, 5, 6, 7]`:

1. The even numbers are `[2, 4, 6]` and the odd numbers are `[1, 3, 5, 7]`.
2. The second largest even number is `4` and the second largest odd number is `5`.
3. Their sum is `4 + 5 = 9`.

Thus, the output is `9`. */
import java.util.Arrays;
import java.util.Scanner;

public class ComplexMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int[] e = new int[n];
    int[] o = new int[n];
    int j = 0, k = 0;

    for (int i = 0; i < n; i++) {
      if (a[i] % 2 == 0) {
        e[j++] = a[i];
      } else {
        o[k++] = a[i];
      }
    }

    Arrays.sort(e);
    Arrays.sort(o);
    int ne = e.length;
    int no = o.length;
    int res = e[ne - 2] + o[no - 2];
    System.out.println("Result: " + res);
  }
}
