import java.util.Scanner;
public class charsmap {
    public static void main(String[] args) {
        int i=0,j=0,c=0,max=0,min =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name 1: ");
        String s1=sc.nextLine();
        System.out.println("Enter name 2: ");
        String s2=sc.nextLine();
        int n1=s1.length(), n2=s2.length();
        //char ca1[]= s1.toCharArray();
        //char ca2[]= s2.toCharArray();
        int h1[]=new int[26];
        int h2[]=new int[26];
        for (i=0;i<n1;i++)
        {
            h1[s1.charAt(i)-'a']++;
        }
        for (i=0;i<n2;i++)
        {
            h2[s2.charAt(i)-'a']++;
        }
        for (i=0;i<n1;i++)
        {
           if(h1[i]!=h2[i])
           {
            c++;
           }
        }
        if(c>0) System.out.println("NO");
        else  System.out.println("YES");
    }
}
