
/* **Question:**

Write a program to replace all occurrences of two specified characters in a given string. The program should replace every occurrence of the first character with the second character and vice versa. 

**Input:**
1. A string (e.g., `"hello world"`)
2. The first character to be replaced (e.g., `'o'`)
3. The second character to replace with (e.g., `'a'`)

**Output:**
- The modified string after replacing the characters.

**Example:**

**Input:**
```
hello world
o
a
```

**Output:**
```
hella warld
```*/
import java.util.Scanner;

public class replacechar {
  public static void main(String[] args) {
    int i = 0, j = 0, c = 0, max = Integer.MIN_VALUE, min = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String s = sc.nextLine();
    System.out.println("Enter character ");
    char ch1 = sc.next().charAt(0);
    System.out.println("Enter character ");
    char ch2 = sc.next().charAt(0);
    int n = s.length();
    String ans = "";
    for (i = 0; i < n; i++) {
      if (s.charAt(i) == ch1) {
        ans = ans + ch2;
      } else if (s.charAt(i) == ch2) {
        ans = ans + ch1;
      } else
        ans = ans + s.charAt(i);
    }
    System.out.println(ans);
  }
}