import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter NUM");
    int n = sc.nextInt();
    int a = fibo(n);
    System.out.println(a);
  }

  private static int fibo(int n) {
    if (n == 0)
      return 0;
    if (n == 1 || n == 2)
      return 1;
    return fibo(n - 2) + fibo(n - 1);
  }
}
