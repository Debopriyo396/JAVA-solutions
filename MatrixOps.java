/*SIMPLE MATRIX OPERATIONS LIKE ADD, DIAGONAL SUM, UPPER TRIANGLE, BOUNDARY ELEMENTS SUM ,MULTIPLICATION*/
import java.util.Scanner;
public class MatrixOps {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows");
    int r = sc.nextInt();
    System.out.println("enter columns");
    int c = sc.nextInt();
    int a[][] = new int[r][c];
    int i, j = 0, s = 0;
    System.out.println("enter elements");
    for (i = 0; i < r; i++) {
      for (j = 0; j < c; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    // sum
    for (i = 0; i < r; i++) {
      for (j = 0; j < c; j++) {
        s += a[i][j];
      }
    }
    System.out.println("SUM of elements: " + s);
    // diagonal sum
    s = 0;
    for (i = 0; i < r; i++) {
      for (j = 0; j < c; j++) {
        if (i == j)
          s += a[i][j];
      }
    }
    System.out.println("SUM of LEFT DIAGONAL elements: " + s);
    // upper triangle
    s = 0;
    for (i = 0; i < r; i++) {
      for (j = 0; j < c - i; j++) {
        s += a[i][j];
      }
    }
    System.out.println("SUM of upper triangular elements: " + s);
    // boundary elements
    s = 0;
    for (i = 0; i < c; i++) {
      s += a[0][i];
    }
    for (i = 0; i < c; i++) {
      s += a[r - 1][i];
    }
    for (i = 1; i < r - 1; i++) {
      s += a[i][0];
    }
    for (i = 1; i < r - 1; i++) {
      s += a[i][r - 1];
    }
    System.out.println("SUM of BOUNDARY elements: " + s);
    // multiplication

    int b[][] = new int[r][c];
    System.out.println("enter elements of 2nd matrix");
    for (i = 0; i < r; i++) {
      for (j = 0; j < c; j++) {
        b[i][j] = sc.nextInt();
      }
    }
    int k = 0;
    int mul[][] = new int[r][c];
    for (i = 0; i < r; i++) {
      for (j = 0; j < c; j++) {
        mul[i][j] = 0;
        for (k = 0; k < c; k++) {
          mul[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    System.out.println("MULTIPLICATION MATRIX : ");
    for (i = 0; i < r; i++) {
      System.out.println(" ");
      for (j = 0; j < c; j++) {
        System.out.print(" "+mul[i][j]);
      }
    }
  }
}
// 123
// 456
// 789
//