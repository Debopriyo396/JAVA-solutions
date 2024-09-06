//QUADRATIC FORMULA
import java.util.Scanner;
public class quadra {
    public static void main(String[] args) {
        int i=0,j=0,max=0,min =0,d=0;
        double r1=0.0,r2=0.0,rp=0.0,ip=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A: ");
        int a=sc.nextInt();
        System.out.println("Enter B: ");
        int b=sc.nextInt();
        System.out.println("Enter C: ");
        int c=sc.nextInt();
        d= b*b -4*a*c;
        if(d>0)
        {
        r1=(-b+Math.sqrt(d)) /(2*a);
        r2=(-b-Math.sqrt(d)) /(2*a);
        System.out.println("Root1: "+r1+" Root2: "+r2);
        }
        else if(d<0)
        {
        rp=(-b)/(2*a) ;
        ip=(Math.sqrt(-d)) /(2*a) ;
        System.out.println(rp+"+"+ip+"i");
        System.out.println(rp+"-"+ip+"i");
        }
        else
        {
        r1=(-b)/(2*a);
        System.out.println("Root: "+r1);
        }
    }
}
