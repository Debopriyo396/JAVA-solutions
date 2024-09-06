
/*### Question:

**Problem Statement:**

Write a program to find the minimum distance between two specific integers in a given array. The integers are provided as the lower and upper limits. If either of the integers is not present in the array, or if they are not found in the same array, return "Element not present here".

**Input:**

1. An integer `n` representing the number of elements in the array.
2. An array of `n` integers.
3. Two integers `x` and `y` which are the lower and upper limits to find in the array.

**Output:**

- Print the minimum distance between any occurrences of `x` and `y` in the array. If either `x` or `y` is not present in the array or they are not found together, print "Element not present here".

**Example:**

**Input:**

```
Enter number of elements: 7
Enter array elements: 1 3 5 2 3 7 5
Enter lower limit: 3
Enter upper limit: 5
```

**Output:**

```
The minimum distance is: 1
```

**Explanation:**

For the array `[1, 3, 5, 2, 3, 7, 5]`:
- The number `3` occurs at indices `[1, 4]`.
- The number `5` occurs at indices `[2, 6]`.
- The minimum distance between `3` and `5` is `1` (between indices `2` and `4`). */
import java.util.Scanner;

public class MinnoOfInts {
  public static void main(String[] args) {
    int i = 0, j = 0, s = 0, res = 0, c1 = 0, c2 = 0, b = 0, c = 0, mini = Integer.MAX_VALUE;
    int lastX=-1; // Last position of x
    int lastY=-1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Enter lower limit: ");
    int x = sc.nextInt();
    System.out.println("Enter upper limit: ");
    int y = sc.nextInt();
    for (i = 0; i < n; i++) {
      if (a[i] == x) {
        c1++;

      }
      if (a[i] == y) {
        c2++;
      }
    }
    if (c1 == 0 && c2 == 0) {
      System.out.println("Element not present here");
    } else {
      for (i = 0; i < n; i++) {
        if (a[i] == x) {
          lastX = i;
          if (lastY != -1) {
            mini=Math.min(mini, Math.abs(lastX - lastY));
          }
        }

        if (a[i] == y) {
          lastY = i;
          if (lastX != -1) {
            mini = Math.min(mini, Math.abs(lastX - lastY));
          }
        }
      }
    }
    if (mini == Integer.MAX_VALUE) {
      System.out.println("Element not present here");
    } else {
      System.out.println("The minimum distance is: " + mini);
    }
  }
}
