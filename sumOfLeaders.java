
/***Question:**

Write a program to find the sum of all "leader" elements in an array. An element is considered a leader if it is strictly greater than all the elements to its right. The program should output the sum of all leader elements.

**Input:**
- An integer `n`, the number of elements in the array.
- `n` integers representing the elements of the array.

**Output:**
- The sum of all leader elements.

**Example:**

**Input:**
```
7
10 22 5 75 65 80 80
```

**Output:**
```
180
```

**Explanation:**
- The leader elements in the array are `10`, `22`, `75`, and `80`. Their sum is `180`. */
import java.util.Scanner;

public class sumOfLeaders {
  public static void main(String[] args) {
    int i = 0, j = 0, s = 0, res = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n - 1; i++) {
      boolean l = true;
      for (j = i + 1; j < n; j++) {
        if (a[i] <= a[j]) {
          l = false;
          break;
        }
      }
      if (l == true)
        s += a[i];
    }
    s = s + a[n - 1];
    System.out.println("Sum of leaders:" + s);
  }
}
