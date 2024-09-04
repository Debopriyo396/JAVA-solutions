import java.util.Scanner;

public class CheckWordPresBruteForce {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sentence:");
    String s = sc.nextLine();
    System.out.println("Enter word:");
    String t = sc.next();

    boolean found = false;
    int n = s.length();
    int m = t.length();

    for (int i = 0; i <= n - m; i++) { // Traverse the string `s`
      int j;
      for (j = 0; j < m; j++) { // Compare substring of length `m` with the word `t`
        if (s.charAt(i + j) != t.charAt(j)) {
          break; // If characters don't match, break and check the next substring
        }
      }
      if (j == m) { // If the loop completed, word `t` is found
        found = true;
        break;
      }
    }

    if (found) {
      System.out.println("YES, the word '" + t + "' is present in the sentence.");
    } else {
      System.out.println("NO, the word '" + t + "' is not present in the sentence.");
    }

    sc.close();
  }
}
