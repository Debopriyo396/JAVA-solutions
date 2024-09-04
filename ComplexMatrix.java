import java.util.Arrays;
import java.util.Scanner;

public class ComplexMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    // Dynamically sized arrays for even and odd numbers
    int[] e = new int[n];
    int[] o = new int[n];
    int j = 0, k = 0;

    // Separate even and odd numbers
    for (int i = 0; i < n; i++) {
      if (a[i] % 2 == 0) {
        e[j++] = a[i];
      } else {
        o[k++] = a[i];
      }
    }

    // if (j < 2 || k < 2) {
    // System.out.println("Not enough elements to find the second largest even and
    // odd numbers.");
    // return;
    // }

    // Find second maximum even and odd numbers
    // int sme = findSecondMax(e, j);
    // int smo = findSecondMax(o, k);
    Arrays.sort(e);
    Arrays.sort(o);
    int ne = e.length;
    int no = o.length;
    int res = e[ne - 2] + o[no - 2];
    // Calculate the result
    // int res = sme + smo;
    System.out.println("Result: " + res);
  }

  // private static int findSecondMax(int[] a, int len) {
  // int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
  // for (int i = 0; i < len; i++) {
  // if (a[i] > max) {
  // smax = max;
  // max = a[i];
  // } else if (a[i] > smax && a[i] < max) {
  // smax = a[i];
  // }
  // }
  // return smax;
  // }
}
