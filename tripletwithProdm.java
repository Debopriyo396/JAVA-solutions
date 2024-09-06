
/* **Question:**

Write a program to find the number of triplets in an array where the product of the three elements is equal to a given number `m`. Each element can be used multiple times, but a triplet should not use the same element more than the number of times it appears in the array.

**Input:**
- An integer `n`, the number of elements in the array.
- `n` integers representing the elements of the array.
- An integer `m`, the product that the triplet should equal.

**Output:**
- The number of triplets whose product equals `m`.

**Example:**

**Input:**
```
5
1 2 3 4 6
12
```

**Output:**
```
2
```

**Explanation:**
- The triplets that satisfy the condition are `(1, 2, 6)` and `(2, 3, 2)`. Hence, the output is `2`.*/
import java.util.Scanner;

public class tripletwithProdm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Enter the product (m):");
    int m = sc.nextInt();

    int count = 0;

    // Store element frequencies in a hash map
    int[] freq = new int[100001]; // Assuming elements are <= 100000
    for (int i = 0; i < n; i++) {
      freq[a[i]]++;
    }

    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] != 0 && a[j] != 0 && m % (a[i] * a[j]) == 0) {
          int k = m / (a[i] * a[j]);
          if (k <= 100000 && freq[k] > 0) {
            // Ensure we are not using the same element twice
            if ((k == a[i] || k == a[j]) && freq[k] < 2) {
              continue;
            }
            count++;
          }
        }
      }
    }

    // Each triplet is counted three times, so divide the result by 3
    System.out.println("Number of Triplets: " + count / 3);
  }
}
