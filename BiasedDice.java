import java.util.Scanner;

public class BiasedDice {
  public static void main(String[] args) {
    int i = 0, j = 0, c = 0, max = 0, min = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sum: ");
    int s = sc.nextInt();
    for (i = 1; i <= 6; i++) {
      if (s - i <= 6 && s - i >= 1) {
        c++;
      }
    }
    System.out.println("No of combinations " + c);
  }
}
