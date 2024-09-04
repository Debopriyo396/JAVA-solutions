import java.math.*;
import java.util.*;

public class Middleword {
  public static void main(String[] args) {
    int i = 0, h = 0, e = 0, dq = 0;
    boolean iw = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    String s = sc.nextLine();
    s = " " + s;
    int n = s.length();
    String w = "";

    int start, j;
    int end = n;
    int c = 0;
    int nw = 0;
    for (i = 0; i < n; i++) {
      char ch = s.charAt(i);
      if (ch == ' ') {
        c++;
      }
    }
    String arr[] = new String[c];
    int k = 0;
    for (i = n - 1; i >= 0; i--) {
      char ch = s.charAt(i);
      w = "";
      if (ch == ' ') {
        start = (i + 1);
        for (j = start; j < end; j++) {
          w = w + s.charAt(j);
        }
        System.out.println("----" + w);
        arr[k++] = w;
        end = i;
      }
    }
    int z = arr.length;
    String r = "";
    for (int l = z - 1; l >= 0; l--) {
      if (l != (z / 2))
        r = r + " " + arr[l];
    }
    System.out.println(r);
  }
}
