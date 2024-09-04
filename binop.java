import java.util.Scanner;
public class binop {
    public static void main(String[] args) {
        int i=0,j=0,c=0,ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=sc.nextLine();
        int n=s.length();
        for(i=1;i<n;i++)
        {
            if(i%2!=0)
            {
            if(s.charAt(i)=='A')
            ans=ans + (s.charAt(i-1)-'0' & s.charAt(i+1)-'0');
            else if(s.charAt(i)=='B')
            ans=ans + (s.charAt(i-1)-'0' | s.charAt(i+1)-'0');
            else
            ans=ans + (s.charAt(i-1)-'0' ^ s.charAt(i+1)-'0');
            }
        }
        System.out.println("Result: "+ans);
    }
}
