import java.util.Scanner;

public class DiffSumDivFour {
  public static void main(String[] args) {
    int i, s = 0, c = 0, f = 0, d = 0, nd = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();
    System.out.println("Enter m");
    int m = sc.nextInt();
    for (i = 1; i <=m; i++) {
      if (i % 4 == 0)
        d+= i;
      else
        nd+= i;
    }
    s = nd - d;
    System.out.println(s);
  }
}
