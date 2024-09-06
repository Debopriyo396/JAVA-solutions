
/***Question:** 

You are given a maze of houses, each containing a certain amount of food. A rat needs to collect a certain amount of food to reach its destination. The amount of food required is calculated as `R * U`, where `R` is the number of rats and `U` is the food unit each rat needs.

Write a program to determine the minimum number of houses the rat needs to visit to collect at least the required amount of food. If it's not possible to collect enough food from the given houses, print `0`. If there are no houses, print `-1`.

**Input:**
- The first line contains an integer `R` (number of rats).
- The second line contains an integer `U` (food unit each rat needs).
- The third line contains an integer `n` (number of houses).
- The fourth line contains `n` integers representing the amount of food in each house.

**Output:**
- Print the minimum number of houses needed to collect at least the required amount of food.
- If not enough food can be collected, print `0`.
- If there are no houses, print `-1`.

**Example:**

**Input:**
```
3
10
5
6 4 2 5 7
```

**Output:**
```
2
```

**Explanation:**

- Total food required = `3 * 10 = 30`
- Food collected from houses in sequence:
  - After house 1: `6` (not enough)
  - After house 2: `6 + 4 = 10` (not enough)
  - After house 3: `10 + 2 = 12` (not enough)
  - After house 4: `12 + 5 = 17` (not enough)
  - After house 5: `17 + 7 = 24` (not enough)
- All houses visited, but still not enough food. So, the output is `0`. */
import java.util.Scanner;

public class RatsMaze {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Read input values
    System.out.println("Enter R: ");
    int r = sc.nextInt();
    System.out.println("Enter Unit: ");
    int u = sc.nextInt();
    System.out.println("Enter n: ");
    int n = sc.nextInt();

    // Edge case: No houses
    if (n <= 0) {
      System.out.println(-1);
      return;
    }

    int[] arr = new int[n];
    System.out.println("Enter Food in each House: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int requiredFood = r * u;
    int totalFood = 0;
    int houseCount = 0;

    // Calculate the number of houses required
    for (int i = 0; i < n; i++) {
      totalFood += arr[i];
      houseCount++;
      if (totalFood >= requiredFood) {
        System.out.println("No of houses needed: " + houseCount);
        return;
      }
    }

    // If not enough food was collected
    System.out.println(0);
  }
}
