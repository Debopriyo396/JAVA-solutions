import java.util.Scanner;

public class ProductSmallestPair {

  public static void main(String[] args) {
    int i, c = 0, f = 0, d = 0, nd = 0, min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int n = sc.nextInt();
    System.out.println("Enter sum");
    int s = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      if (a[i] <= min) {
        smin = min;
        min = a[i];
      }
      if (a[i] > min && a[i] < smin) {
        smin = a[i];
      }
    }
    d = min * smin;
    if (d < s)
      System.out.println(d);
    else
      System.out.println(0);
  }
}