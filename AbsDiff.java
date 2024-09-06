// ### Problem Statement for the Code (AbsDiff.java):

// **Question**:  
// Given a number `NUM`, a difference `DIFF`, and an array of size `n`, write a program to determine how many elements in the array have an absolute difference with `NUM` that is less than or equal to `DIFF`. If no such elements are found, return `-1`.

// **Input**:  
// A number `NUM`, a difference `DIFF`, the size of the array `n`, and an array of integers.

// **Output**:  
// The count of elements whose absolute difference with `NUM` is less than or equal to `DIFF`, or `-1` if no such element exists.

// **Example**:

// **Input**:  
// `5 3 4 2 8 10 3`

// **Output**:  
// `2`

import java.util.Scanner;

public class AbsDiff {
  public static void main(String[] args) {
    int i, s = 0, c = 0, f = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter NUM");
    int num = sc.nextInt();
    System.out.println("Enter DIFF");
    int d = sc.nextInt();
    System.out.println("Enter n");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter Array elements");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      if (Math.abs(arr[i] - num) <= d) {
        f = 1;
        c++;
      }
    }
    if (f == 0)
      System.out.println(-1);
    else
      System.out.println(c);
  }
}
