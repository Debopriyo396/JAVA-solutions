import java.util.Scanner;

public class SmoLargeWord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter sentence:");
    String s = sc.nextLine();
    String res="";
    s = ' ' + s;
    String ss="";
    int min=Integer.MAX_VALUE;
    int n = s.length(),j=0;
    int end=n,start=0,max=Integer.MIN_VALUE;
    String w="";
    for (int i = n - 1; i > 0; i--) {
      w = "";
      if (s.charAt(i) == ' ') {
        start = i + 1;
        for (j = start; j < end; j++) {
          w = w + s.charAt(j);
        }
        end = i;
        //max = Integer.max(max, w.length());
        int p=w.length();
        if(p>max)
        {
          res = w;
          max = p;
        }
       if(p<min)
       {
        ss=w;
        min = p;
       }
      }
    }
    System.out.println(res);
    System.out.println(ss);
  }
}
