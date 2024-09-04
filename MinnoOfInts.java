import java.util.Scanner;

public class MinnoOfInts {
  public static void main(String[] args) {
    int i = 0, j = 0, s = 0, res = 0, c1 = 0, c2 = 0, b = 0, c = 0, mini = Integer.MAX_VALUE;
    int lastX=-1; // Last position of x
    int lastY=-1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Enter lower limit: ");
    int x = sc.nextInt();
    System.out.println("Enter upper limit: ");
    int y = sc.nextInt();
    for (i = 0; i < n; i++) {
      if (a[i] == x) {
        c1++;

      }
      if (a[i] == y) {
        c2++;
      }
    }
    if (c1 == 0 && c2 == 0) {
      System.out.println("Element not present here");
    } else {
      for (i = 0; i < n; i++) {
        if (a[i] == x) {
          lastX = i;
          if (lastY != -1) {
            mini=Math.min(mini, Math.abs(lastX - lastY));
          }
        }

        if (a[i] == y) {
          lastY = i;
          if (lastX != -1) {
            mini = Math.min(mini, Math.abs(lastX - lastY));
          }
        }
      }
    }
    if (mini == Integer.MAX_VALUE) {
      System.out.println("Element not present here");
    } else {
      System.out.println("The minimum distance is: " + mini);
    }
  }
}
