import java.util.Scanner;

public class round {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int n = sc.nextInt();
    int s = n;
    while (s != 1 && s != 4) { // If it reaches 4, it's in an unhappy number cycle
      s = check(s);
    }
    if (s == 1) {
      System.out.println(n + " is a Happy Number");
    } else {
      System.out.println(n + " is not a Happy Number");
    }
  }

  private static int check(int s) {
    int rem = 0, sum = 0;
    while (s > 0) {
      rem = s % 10;
      sum += rem * rem;
      s /= 10;
    }
    return sum;
  }
}
