import java.util.Scanner;

public class consVowCost {
  public static void main(String[] args) {
    int i = 0, j = 0, max = Integer.MIN_VALUE, min = 0, asc = 0, sum = 0, cost = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String s = sc.nextLine();
    int n = s.length();
    String ans = "";
    for (i = 0; i < n; i++) {
      if (isVowel(s.charAt(i)) == false) {
        char c = s.charAt(i);
        c = Character.toLowerCase(c);
        sum = checkdiff(c);
        cost += sum;
      }
    }
    System.out.println(cost);
  }

  public static int checkdiff(char c) {
    int min = Integer.MAX_VALUE;
    c = Character.toLowerCase(c);
    char[] v = { 'a', 'e', 'i', 'o', 'u' };
    for (int i = 0; i < 5; i++) {
      if (min > Math.abs(c - v[i]))
        min = Math.abs(c - v[i]);
    }
    return min;
  }

  public static boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
      return true;
    return false;
  }

}
