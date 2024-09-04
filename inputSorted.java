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
