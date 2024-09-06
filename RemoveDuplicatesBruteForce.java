/* **Question:**

You are given an array of integers. The task is to remove duplicate elements from the array using a brute-force approach. After removing duplicates, you need to print the modified array.

Write a program to perform the following steps:
1. Iterate through the array and remove duplicate elements.
2. Print the array after removing duplicates.

**Input:**
- An integer array (e.g., `{1, 2, 3, 5, 1, 8, 9, 3, 10, 11, 0, 6}`).

**Output:**
- The array after removing duplicates.

**Example:**

**Input:**
```
{1, 2, 3, 5, 1, 8, 9, 3, 10, 11, 0, 6}
```

**Output:**
```
Array after removing duplicates: 1 2 3 5 8 9 10 11 0 6
```*/
public class RemoveDuplicatesBruteForce {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 5, 1, 8, 9, 3, 10, 11, 0, 6 };
    int n = arr.length;

    // Outer loop iterates through each element
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        // If a duplicate is found
        if (arr[i] == arr[j]) {
          // Shift all elements to the left to remove the duplicate
          for (int k = j; k < n - 1; k++) {
            arr[k] = arr[k + 1];
          }
          n--; // Reduce the size of the array
          //j--; // Check the new element at this position
        }
      }
    }

    // Print the array after removing duplicates
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
