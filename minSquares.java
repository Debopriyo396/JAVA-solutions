import java.util.Scanner;

public class minSquares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int n = sc.nextInt();
    int s = msq(n);
    System.out.println(s);
  }

  public static int msq(int n) {
    int r=0, mc=0;
    if (n <= 0) {
      return 0;
    }
    mc=n;
    for (int i = 1; i * i <= n; i++) {
       r=n-i*i;
       mc= Math.min(mc,1+msq(r));
    }
    return mc;
  }
}
