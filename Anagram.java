import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    int i = 0, j = 0, c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String 1: ");
    String s1 = sc.nextLine();
    System.out.println("Enter String 2 ");
    String s2 = sc.nextLine();
    int n1 = s1.length();
    int n2 = s2.length();
    int h1[] = new int[26];
    int h2[] = new int[26];
    String ans = "";
    for (i = 0; i < n1; i++) {
      h1[s1.charAt(i) - 'a']++;
    }
    for (i = 0; i < n2; i++) {
      h2[s2.charAt(i) - 'a']++;
    }
    for (i = 0; i < 26; i++) {
      if (h1[i] != h2[i]) {
        c = 1;
        break;
      }
    }
    if (c == 0)
      System.out.println("Anagram");
    else
      System.out.println("Not Anagram");
  }
}
