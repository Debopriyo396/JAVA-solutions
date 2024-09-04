
// import java.util.Scanner;

// public class tripletwithProdm {
//   public static void main(String[] args) {
//     int i = 0, j = 0, s = 0, k = 0, c = 0;
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter no of elements: ");
//     int n = sc.nextInt();
//     int a[] = new int[n];
//     System.out.println("Enter Array elements: ");
//     for (i = 0; i < n; i++) {
//       a[i] = sc.nextInt();
//     }
//     System.out.println("Enter the number(product):");
//     int m = sc.nextInt();
//     int h[] = new int[999];
//     for (i = 0; i < n; i++) {
//       h[a[i]]++;
//     }
//     for (i = 0; i < n - 2; i++) {
//       for (j = i + 1; j < n; j++) {
//         if (a[i] * a[j] < m && a[i] * a[j] != 0) {
//           k = m / (a[i] * a[j]);
//           if (check(a, k, j, n)) {
//             if (k != a[i] && k != a[i])
//               c++;
//           }
//         }
//       }
//     }
//     System.out.println("No of Triplets" + c);
//   }

//   public static boolean check(int[] a, int k, int j, int n) {
//     for (int i = j + 1; i < n; i++) {
//       if (k != a[i])
//         return false;
//     }
//     return true;
//   }
// }
// /*
//  * 1 2 3 4 5 6 7 8 9 10
//  * 24
//  * 2 3 1
//  */
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
