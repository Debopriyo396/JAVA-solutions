
// ###Question:

// **Problem Statement:**

// You are given the sum`s`of the faces of two dice.Your task is to find out the number of possible outcomes of rolling two dice such that their sum is equal to`s`.Each die has faces numbered from 1 to 6.

// **Input:**

// -A single integer`s`(2≤s≤12),representing the desired sum of the two dice.

// **Output:**

// -A single integer,representing the number of possible combinations of the two dice that add up to the given sum`s`.

// **Example:**

// **Input:**

// 5

// **Output:**

// 4

// **Explanation:**

// For the input sum`5`,the possible combinations of the two dice are:

// -(1,4)-(2,3)-(3,2)-(4,1)

// Thus,there are 4 possible combinations.
import java.util.Scanner;

public class BiasedDice {
  public static void main(String[] args) {
    int i = 0, j = 0, c = 0, max = 0, min = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sum: ");
    int s = sc.nextInt();
    for (i = 1; i <= 6; i++) {
      if (s - i <= 6 && s - i >= 1) {
        c++;
      }
    }
    System.out.println("No of combinations " + c);
  }
}
