
/* **Question:**

Write a program to determine if a given number is a "Happy Number" or not. A Happy Number is defined as follows:
- Start with any positive integer.
- Replace the number with the sum of the squares of its digits.
- Repeat the process until the number equals 1 (which means it's a Happy Number) or loops endlessly in a cycle that does not include 1 (which means it's not a Happy Number).

**Input:**
- A positive integer (e.g., `19`)

**Output:**
- A message indicating whether the number is a Happy Number or not (e.g., `"19 is a Happy Number"`)

**Example:**

**Input:**
```
19
```

**Output:**
```
19 is a Happy Number
```

**Input:**
```
4
```

**Output:**
```
4 is not a Happy Number
```*/
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
