import java.util.Scanner;
public class sumOfeleLeastKLeng {
  public static void main(String[] args) {
    
    int i = 0, j = 0, s = 0, res = 0, z = 0, f = 0, min =  Integer.MAX_VALUE,si=0,ei=0,ssi=0,eei=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements: ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Enter length: ");
    int k = sc.nextInt();
    int r[] = new int[k];
    for (i = 0; i < n; i++)
    {
      s = 0;
      for (j = i; j < k; j++) {
        s += a[j];
      }
      if (s <= min) {
        ssi = si;
        eei = ei;
        si = j - k + 1;
        min = s;
        ei = j;
        if(si>ssi)
        {
          si = j - k + 1;
          ei = j;
        }
      }
      ssi=si;
    }

    System.out.println("ans:");
    for (i = si; i <=ei; i++)
    {
      System.out.println(a[i]);
    }
  }
}


// 25 11 12 21 25 19 4
