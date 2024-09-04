import java.util.Scanner;

public class cards {
    public static void main(String[] args) {
        int i=0,j=0,c=0,max=0,min =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row: ");
        int r=sc.nextInt();
        for (i=1;i<=r;i++) 
        {
            c=c+2*i;
        } 
        for (i=1;i<r;i++) 
        {
            j=j+i;
        } 
        max=c+j;
        System.out.println("No of Cards: "+max);
    }
}
