/*PRIME NUMBER */
import java.util.Scanner;

public class PrimeNo {
  public static void main(String[] args) {
    int i, s = 0, c = 0, f = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter NUM");
    int n = sc.nextInt();
    c = n;
    for (i = 2; i * i <= n; i++) {
      if (c % i == 0){
        System.out.println("NOT PRIME");
      break;}
    }
    System.out.println(" PRIME");
  }

}
