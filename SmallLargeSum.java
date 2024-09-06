
/* **Question:**

Write a program to find the sum of the largest elements at even and odd indices in an array.

**Input:**
- An integer `n` (number of elements).
- `n` integers (array elements).

**Output:**
- Sum of the largest even-indexed and odd-indexed elements.

**Example:**

**Input:**
```
5
1 3 5 7 9
```

**Output:**
```
16
```

**Explanation:**
- Largest even-indexed element: `9`
- Largest odd-indexed element: `7`
- Sum: `9 + 7 = 16`

**Example:**

**Input:**
```
4
2 4 6 8
```

**Output:**
```
14
```

**Explanation:**
- Largest even-indexed element: `6`
- Largest odd-indexed element: `8`
- Sum: `6 + 8 = 14` */
import java.util.Scanner;

public class SmallLargeSum {
  public static void main(String[] args) {
    int i, j, sum = 0, omax = Integer.MIN_VALUE, emax = Integer.MIN_VALUE, semax = Integer.MIN_VALUE,
        somax = Integer.MIN_VALUE;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements:");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      if (i % 2 == 0) {
        if (a[i] > emax) {
          semax = emax;
          emax = a[i];
        }
        if (a[i] < emax && a[i] > semax) {
          semax = a[i];
        }
      } else {
        for (i = 1; i < n; i += 2) {
          if (a[i] > omax) {
            somax = omax;
            omax = a[i];
          }
          if (a[i] < omax && a[i] > somax) 
            somax = a[i];
        }
      }
      sum = somax + semax;
      System.out.println("Sum  : " + sum);
    }
  }
}
