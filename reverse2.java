
/* **Question:**

Write a program to reverse each word in a given sentence while maintaining the original order of the words. 

**Input:**
1. A sentence (e.g., `"YOU ARE A BOY"`)

**Output:**
- The sentence with each word reversed (e.g., `"uoy era a yob"`)

**Example:**

**Input:**
```
YOU ARE A BOY
```

**Output:**
```
uoy era a yob
```*/
import java.util.Scanner;

public class reverse2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter sentence");
    String s = sc.nextLine();
    //YOU ARE A BOY=> uoy era a yob
    s = s + " ";
    int n=s.length();
    int j = 0, start = 0, end = 0,c=0;
    char ch;
    String w = "";
    String ans = "";
    for (int i = 0; i < n; i++) {
      ch = s.charAt(i);
      if (ch == ' ') {
        w = "";
        for (j = start; j < i; j++) {
          w = w + s.charAt(j);
        }
        start = i + 1;
        ans = ans +" " +reverse(w);

      }

    }
    System.out.println(ans.trim());
    }

  private static String reverse(String w) {
    int n = w.length();
    int i;
    String res="";
    for (i = 0; i < n; i++) {
      res = w.charAt(i) + res;
    }
    return res;
  }
}
