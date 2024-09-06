
/* ### Question:

**Problem Statement:**

Write a program to count the number of distinct elements in an array.

**Input:**

1. An integer `n` representing the number of elements in the array.
2. An array of `n` integers.

**Output:**

- Print the number of distinct elements in the array.

**Example:**

**Input:**

```
Enter no of elements: 6
Enter Array elements: 1 2 3 2 4 1
```

**Output:**

```
4
```

**Explanation:**

In the array `[1, 2, 3, 2, 4, 1]`, the distinct elements are `1, 2, 3, 4`. Hence, there are `4` distinct elements.*/
import java.util.Scanner;

public class NoOfDistinctEle {
  public static void main(String[] args) {
    int i = 0, j = 0, s = 0, flag = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements: ");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter Array elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      flag = 0;
      for (j = i + 1; j < n; j++) {
        if (a[i] == a[j]) {
          flag = 1;
          break;
        }
      }
      if (flag == 0)
        s++;
    }
    System.out.println(s);
  }
}
