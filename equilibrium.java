import java.util.*;

public class equilibrium {
    public static void main(String[] args) {
        int i=0,j=0,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Array elements: ");
        for (i = 0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        for (i = 0; i<n; i++) {
            s=s+a[i];
        }
        int ans=check(a,n,s);
        if(ans!=-1)
        System.out.println("equilibrium index: "+ans);
        else
        System.out.println("NO equilibrium index: ");
    }
    static int check(int a[],int n,int s)
    {  int lsum=0,rsum=0;
        for (int i = 0; i<n; i++) {
            rsum=s-a[i]-lsum;
            if(lsum==rsum)
            {
                return i;
            }
            lsum+=a[i];
        }
        return -1;
    }
}
