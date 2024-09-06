
/* **Question:**

Write a program to find the maximum sum of any contiguous subarray in a given array of integers.

**Input:**
- An integer `n`, the number of elements in the array.
- `n` integers representing the elements of the array.

**Output:**
- The maximum sum of any contiguous subarray.

**Example:**

**Input:**
```
5
1 -2 3 4 -1
```

**Output:**
```
7
```

**Explanation:**
- The maximum sum of any contiguous subarray is achieved with the subarray `[3, 4]` which sums to `7`.*/
import java.util.Scanner;

public class SubaLargestSum {
  public static void main(String[] args) {
    int i = 0, j = 0, s = 0,maxi = Integer.MIN_VALUE;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      s = 0;
      for (j = i; j < n; j++) {
        s = s+a[j];
        maxi = Integer.max(maxi, s);
      }
    }
    System.out.println(maxi);
  }
}
