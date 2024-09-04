import java.util.Scanner;

public class AbsDiff {
  public static void main(String[] args) {
    int i, s = 0, c = 0, f = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter NUM");
    int num = sc.nextInt();
    System.out.println("Enter DIFF");
    int d = sc.nextInt();
    System.out.println("Enter n");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter Array elements");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      if (Math.abs(arr[i] - num) <= d) {
        f = 1;
        c++;
      }
    }
    if (f == 0)
      System.out.println(-1);
    else
      System.out.println(c);
  }
}
