
/***Question:**

Write a program to calculate the standard deviation of a given set of numbers.

**Input:**
- An integer `n`, the number of elements.
- `n` integers, the elements of the array.

**Output:**
- The standard deviation of the given numbers, rounded to the nearest integer.

**Example:**

**Input:**
```
5
10
20
30
40
50
```

**Output:**
```
15
```

**Explanation:**
- The average of the numbers is 30.
- The squared differences from the average are: (10-30)², (20-30)², (30-30)², (40-30)², (50-30)².
- The average of these squared differences is 225.
- The square root of 225 is 15, which is the standard deviation. */
import java.util.Scanner;

public class StandardDevi {
  public static void main(String[] args) {
    int i = 0, j = 0, s = 0, res = 0, z = 0, f = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      s += a[i];
    }
    int avg = s / n;
    for (i = 0; i < n; i++) {
      res += Math.pow((a[i] - avg), 2);
    }
    f = (res) / n;
    z = (int) Math.sqrt(f);
    System.out.println("Standard Deviation:" + z);
  }
}
