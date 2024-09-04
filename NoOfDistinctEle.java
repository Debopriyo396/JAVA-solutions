import java.util.Scanner;

public class NoOfDistinctEle {
  public static void main(String[] args) {
    int i = 0, j = 0, s = 0, flag = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements: ");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter Array elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (i = 0; i < n; i++) {
      flag = 0;
      for (j = i + 1; j < n; j++) {
        if (a[i] == a[j]) {
          flag = 1;
          break;
        }
      }
      if (flag == 0)
        s++;
    }
    System.out.println(s);
  }
}
