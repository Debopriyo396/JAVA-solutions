
/*### Question:

**Problem Statement:**

You are given a string `s1` that contains a sentence with words separated by multiple spaces. Your task is to process the string to remove any extra spaces between words and count the length of the resulting string.

**Input:**

- A single line of input `s1` (1 ≤ length of `s1` ≤ 1000) containing a sentence with words separated by spaces.

**Output:**

- The processed string with extra spaces removed.
- The length of the processed string.

**Example:**

**Input:**

`Hello    world amazing`

**Output:**

`Hello world amazing`
`20`

**Explanation:**

For the input string `Hello    world amazing`:

1. Remove extra spaces to get the cleaned-up string `Hello world amazing`.
2. The length of this processed string is `20`.

The length count includes all characters including spaces, but extra spaces between words are removed.*/ 
import java.util.Scanner;

public class BlankString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter sentence no blank");// Hello    world amazing
    String s1 = sc.nextLine();
    int n1 = s1.length();
    int arr[] = new int[n1];
    String arr2[]=new String[100];
    String a="",w="";
    int k = 0, j = 0;
    String v = "";
    for (int i = 0; i < n1; i++) {// find no of words
      if (s1.charAt(i) != ' ')
        w = w + s1.charAt(i);
      else if (s1.charAt(i) == ' ') {
        v = v + w + ' ';
        w = "";
        while (s1.charAt(i) == ' ') {
          i++;
        }
        i -= 1;
      }
    }
    v = v + w;
    int h = v.length();
    System.out.println(v);
    System.out.println(h);
  }
}
