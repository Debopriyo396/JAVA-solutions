import java.util.Scanner;

public class ratsMaze {
  public static void main(String[] args) {
    int i, s = 0, d = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter  R");
    int r = sc.nextInt();
    System.out.println("Enter  Unit");
    int u = sc.nextInt();
    System.out.println("Enter n");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter Food in each House");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int fr = r * u;
    for (i = 0; i < n; i++) {
      d = i;
      s += arr[i];
      if (s >= fr)
        break;
    }
    if (n <= 0)
      System.out.println(-1);
    if (fr > s)
      System.out.println(0);
    else
      System.out.println("No of houses needed: " + (d + 1));
  }
}