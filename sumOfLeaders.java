import java.util.Scanner;

public class sumOfLeaders {
  public static void main(String[] args) {
    int i = 0, j = 0, s = 0, res = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n - 1; i++) {
      boolean l = true;
      for (j = i + 1; j < n; j++) {
        if (a[i] <= a[j]) {
          l = false;
          break;
        }
      }
      if (l == true)
        s += a[i];
    }
    s = s + a[n - 1];
    System.out.println("Sum of leaders:" + s);
  }
}
