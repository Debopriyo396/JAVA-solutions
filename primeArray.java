import java.util.Scanner;

public class primeArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter limit");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int p = 0, np = 0;
    for (int i = 0; i < n; i++) {
      if (isPrime(a[i])) {
        p++;
      } else
        np++;
    }
    System.out.println("PRIMES:" + p);
    System.out.println("not PRIMES:" + np);
  }

  private static boolean isPrime(int n) {
    for (int i = 2; i*i <= n; i++) {
      if (n % i == 0)
        return false;
    }
    if (n == 1)
      return false;
    return true;
  }
}
