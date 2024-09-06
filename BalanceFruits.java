
// ### Problem Statement for the Code (BalanceFruits.java):

// **Question**:  
// You are given three integers: `A` (apples), `M` (mangoes), and `C` (cost). The goal is to balance the number of apples and mangoes by adjusting the cost. If the number of apples exceeds mangoes, reduce the apples by the cost. Similarly, if mangoes exceed apples, reduce the mangoes by the cost. Print the remaining cost after balancing the apples and mangoes.

// **Input**:  
// Three integers: `A`, `M`, and `C` representing apples, mangoes, and cost.

// **Output**:  
// The remaining cost after balancing.

// **Example**:

// **Input**:  
// `5 3 4`

// **Output**:  
// `2`
import java.util.Scanner;

public class BalanceFruits {
  public static void main(String[] args) {
    int i = 0, j = 0, max = 0, res = 0, n = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A: ");
    int a = sc.nextInt();
    System.out.println("Enter M: ");
    int m = sc.nextInt();
    System.out.println("Enter C: ");
    int c = sc.nextInt();
    if (a > m) {
      c -= (a - m);
    } else if (m > a) {
      c -= (m - a);
    }
    System.out.println(c);
  }

}
