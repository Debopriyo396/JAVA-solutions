
/*### Question:

**Problem Statement:**

Write a program that performs the following operations:
1. Convert a given decimal number to its binary representation.
2. Convert a given binary number to its decimal representation.

**Input:**

1. A decimal number `n` (for conversion to binary).
2. A binary number `b` (for conversion to decimal).

**Output:**

1. The binary representation of the given decimal number.
2. The decimal representation of the given binary number.

**Example:**

**Input:**

```
enter number
5
enter Binary number
1101
```

**Output:**

```
101
13
```

**Explanation:**

1. For the decimal number `5`, its binary representation is `101`.
2. For the binary number `1101`, its decimal representation is `13`. */
import java.util.Scanner;

public class dec2bin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int n = sc.nextInt();
    int c = n;
    int rem = 0;
    String b = "";
    // 5= 101
    while (n > 0) {
      rem = n % 2;
      b = rem+b;
      n = n / 2;
    }
    System.out.println(b);
    int num = Integer.parseInt(b);// string to number 
    System.out.println(num);// decimal to binary
    b2d();// binary to decimal
  }

  public static void b2d() {// converts binary to decimal
    // 1101
    Scanner sc = new Scanner(System.in);
    System.out.println("enter Binary number"); // 1101
    int b = sc.nextInt(); 
    int c = b,lastdig=0;
    int i = 0, j = 0, d = 0;
    // String s = Integer.toString(b);
    // int n = s.length();
    //char ch;
    while(b>0)
    {
      lastdig = b % 10;
      d = d + lastdig * (int) Math.pow(2, i++);
      b /= 10;
    }
    System.out.println(d);
  }
}
