import java.util.Scanner;

public class StonesMars {
  public static void main(String[] args) {
    int i,s=0,c=0,d=0,l=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter M(size of bag, no of different wghts of stones on mars)");
    int m = sc.nextInt();
    System.out.println("Enter N(no of common stones on mars and earth)");
    int n = sc.nextInt();
    int e[] = new int[m];
    int t[]=new int[m];
    for (i = 0; i < m; i++) {
      t[i]=i+1;
    }
    int ms[] = new int[m];
    System.out.println("Enter common stones wieghts");
    for (i = 0; i < n;i++)
      e[i] = sc.nextInt();
    for (i = 0; i < m; i++)
    {
      if (e[i] != t[i])
        ms[i] = t[i];
    }
    l =m-n;
    for (i = 0; i < l;i++)
    {
      d = i;
      s += ms[i];
      if (s >= m) {
        break;
      }
    }
    System.out.println("No of stones selected :"+(d-1));
  }
}
