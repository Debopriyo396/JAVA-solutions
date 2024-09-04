//INCOMPLETE

import java.util.Scanner;
public class exponent2 {
  public static void main(String[] args) {
        int i=0,j=0,max=0,res=0,n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A: ");
        int a=sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        for (i = a; i <= b; i++) {
          if (max < pfacto(i)) {
            max = pfacto(i);
            res = i;
          }
        }
        System.out.println("The number with max 2 within it is: "+res);
  }

  static int pfacto(int i) {
    int c = 0;
    while (i>0 && i%2==0) {
      i = i / 2;
      c++;
    }
    return c;
  }
}
