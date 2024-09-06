/* FIND LCM AND GCD*/
import java.util.Scanner;

public class LcmGcd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n1");
    int n1 = sc.nextInt();
    System.out.println("enter n2");
    int n2 = sc.nextInt();
    int i;
    boolean flag = true;
    int max = Integer.max(n1, n2);
    while (flag) {
      if (max % n1 == 0 && max % n2 == 0) {
        System.out.println("LCM:" + max);
        flag = false;
      }
      max++;
    }
    // GCD
    int g = 0;
    int min = n1 < n2 ? n1 : n2;
    for (int j = 1; j < min; j++) {
      if (n1 % j == 0 && n2 % j == 0)
        g = j;
    }
    System.out.println("GCD: " + g);
  }
}
