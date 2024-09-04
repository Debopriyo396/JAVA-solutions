import java.util.Scanner;

public class StandardDevi {
  public static void main(String[] args) {
    int i = 0, j = 0, s = 0, res = 0, z = 0, f = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      s += a[i];
    }
    int avg = s / n;
    for (i = 0; i < n; i++) {
      res += Math.pow((a[i] - avg), 2);
    }
    f = (res) / n;
    z = (int) Math.sqrt(f);
    System.out.println("Standard Deviation:" + z);
  }
}
