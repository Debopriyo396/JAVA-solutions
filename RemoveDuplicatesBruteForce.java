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
