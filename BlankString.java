import java.util.Scanner;

public class BlankString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter sentence no blank");// Hello    world amazing
    String s1 = sc.nextLine();
    int n1 = s1.length();
    int arr[] = new int[n1];
    String arr2[]=new String[100];
    String a="",w="";
    int k = 0, j = 0;
    String v = "";
    for (int i = 0; i < n1; i++) {// find no of words
      if (s1.charAt(i) != ' ')
        w = w + s1.charAt(i);
      else if (s1.charAt(i) == ' ') {
        v = v + w + ' ';
        w = "";
        while (s1.charAt(i) == ' ') {
          i++;
        }
        i -= 1;
      }
    }
    v = v + w;
    int h = v.length();
    System.out.println(v);
    System.out.println(h);
  }
}
