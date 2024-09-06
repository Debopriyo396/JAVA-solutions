
/* ### Question:

**Problem Statement:**

Write a program that performs the following tasks:

1. Given a list of integers and an integer `n`, insert `n` into the correct position in the list such that the list remains sorted in ascending order.
2. Output the modified list.

**Input:**

- An integer `l` representing the number of elements in the list.
- A list of `l` integers sorted in ascending order.
- An integer `n` to be inserted into the list.

**Output:**

- The modified list with `n` inserted in the correct position to maintain the sorted order.

**Example:**

**Input:**

```
Enter limit: 5
Enter numbers: 1 3 5 7 9
Enter number to insert: 6
```

**Output:**

```
1 3 5 6 7 9
```

**Explanation:**

In the given list `[1, 3, 5, 7, 9]`:
- The number `6` should be inserted between `5` and `7` to keep the list sorted.
- The resulting list after insertion is `[1, 3, 5, 6, 7, 9]`.*/
import java.util.Scanner;
public class inputSorted {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter limit: ");
    int l = sc.nextInt();
    int a[] = new int[l];
    System.out.println("Enter numbers: ");
    for (int i = 0; i < l; i++) {
      a[i] = sc.nextInt();
    }

    System.out.println("Enter number to insert: ");
    int n = sc.nextInt();

    // Create a new array with one extra space to hold the new number
    int r[] = new int[l + 1];
    int i = 0;

    // First for loop: Copy elements from 'a' to 'r' until the correct insertion
    // point is found
    for (i = 0; i < l; i++) {
      if (a[i] < n) {
        r[i] = a[i]; // Copy the current element
      } else {
        break; // Found the insertion point
      }
    }

    // Insert the new number at the correct position
    r[i] = n;

    // Second for loop: Copy the remaining elements from 'a' to 'r'
    for (int j = i; j < l; j++) {
      r[j + 1] = a[j];
    }

    System.out.println("The Result: ");
    for (i = 0; i < l + 1; i++) {
      System.out.print(r[i] + " ");
    }
  }
}
