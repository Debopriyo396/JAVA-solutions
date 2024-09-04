import java.util.Scanner;

public class SmallLargeSum {
  public static void main(String[] args) {
    int i, j, sum = 0, omax = Integer.MIN_VALUE, emax = Integer.MIN_VALUE, semax = Integer.MIN_VALUE,
        somax = Integer.MIN_VALUE;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements:");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      if (i % 2 == 0) {
        if (a[i] > emax) {
          semax = emax;
          emax = a[i];
        }
        if (a[i] < emax && a[i] > semax) {
          semax = a[i];
        }
      } else {
        for (i = 1; i < n; i += 2) {
          if (a[i] > omax) {
            somax = omax;
            omax = a[i];
          }
          if (a[i] < omax && a[i] > somax) 
            somax = a[i];
        }
      }
      sum = somax + semax;
      System.out.println("Sum  : " + sum);
    }
  }
}
