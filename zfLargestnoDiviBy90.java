
/* **Question:**

Write a program to find the largest number that can be formed using a given array of digits where the number is divisible by 90. The array contains only the digits 0 and 5.

**Input:**
- An integer `n`, the number of elements in the array.
- `n` integers representing the elements of the array (each being either 0 or 5).

**Output:**
- The largest number that can be formed which is divisible by 90.

**Note:**
- A number is divisible by 90 if and only if it is divisible by both 9 and 10.
- To be divisible by 10, the number must end with 0.
- To be divisible by 9, the sum of its digits must be divisible by 9. Since the digits are either 0 or 5, the number of 5's must be a multiple of
9.

**Example:**

**Input:**
```
7
5 5 5 5 5 5 0
```

**Output:**
```
5555550
```

**Explanation:**
- The largest number divisible by 90 is formed by using the maximum number of 5's that are a multiple of 9, followed by all the 0's. In this case, we can use 6 fives and 1 zero to form `5555550`.*/
import java.util.Scanner;

public class zfLargestnoDiviBy90 {
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
      if (a[i] == 0)
        z++;
    }
    for (i = 0; i < n; i++) {
      if (a[i] == 5)
        f++;
    }
    System.out.println("          ");
    System.out.println("          ");
    f = (int) Math.floor(f / 9) * 9;
    if (f == 0)
      System.out.println(0);
    else if (z == 0)
      System.out.println(-1);
    else {
      for (i = 0; i < f; i++) {
        System.out.print(5);
      }
      for (i = 0; i < z; i++) {
        System.out.print(0);
      }
    }

  }
}
