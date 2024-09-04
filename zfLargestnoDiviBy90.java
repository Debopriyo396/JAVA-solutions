import java.util.Scanner;

public class zfLargestnoDiviBy90 {
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
      if (a[i] == 0)
        z++;
    }
    for (i = 0; i < n; i++) {
      if (a[i] == 5)
        f++;
    }
    System.out.println("          ");
    System.out.println("          ");
    f = (int) Math.floor(f / 9) * 9;
    if (f == 0)
      System.out.println(0);
    else if (z == 0)
      System.out.println(-1);
    else {
      for (i = 0; i < f; i++) {
        System.out.print(5);
      }
      for (i = 0; i < z; i++) {
        System.out.print(0);
      }
    }

  }
}
