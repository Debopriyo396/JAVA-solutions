
/*### Question:

**Problem Statement:**

Write a program to convert a decimal number to its representation in a given base (up to base 36).

**Input:**

1. An integer `num` representing the decimal number to be converted.
2. An integer `n` representing the base to convert the number to.

**Output:**

- Print the number in the specified base.

**Example:**

**Input:**

```
Enter Number: 255
Enter base to convert to: 16
```

**Output:**

```
Result: FF
```

**Explanation:**

In base 16, the decimal number `255` is represented as `FF`. */
import java.util.Scanner;

public class notation {
    public static void main(String[] args) {
        int rem = 0;
        String ans = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Enter base to convert to: ");
        int n = sc.nextInt();

        while (num != 0) {
            rem = num % n;
            num = num / n;
            ans = nott(rem) + ans;
        }

        System.out.println("Result: " + ans);
    }

    static char nott(int rem) {
        String n = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (rem >= 0 && rem < 36) {
            return n.charAt(rem);
        }
        return ' ';
    }
}
