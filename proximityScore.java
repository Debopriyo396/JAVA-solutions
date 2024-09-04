import java.util.*;

public class proximityScore {
    public static void main(String[] args) {
        int i=0,j=0,c=0,max=0,min =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name 1: ");
        String s1=sc.nextLine();
        System.out.println("Enter name 2: ");
        String s2=sc.nextLine();
        int n1=s1.length(), n2=s2.length();
        /*while(i<Math.min(n1,n2))
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                c+=2;
            }
            i++;
        }*/
        if(n1==n2){
        max=n1;
        min=n2;}
        else if(n1>n2){
        max=n1; 
        min =n2;}
        else {
        max=n2;
        min=n1;
         }
        for (i= 0;i<max;i++) {
            for (j=0;j<min;j++) {
                if(s1.charAt(i)==s2.charAt(j) && i==j){
                c+=2;
                }
                else if(s1.charAt(i)==s2.charAt(j))
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}



/*@charles3367
11 months ago
first solution is absolutely wrong it will never work for 3rd case here is solution in java





public static void main(String[] args) {
		String s1="amitabh";
		String s2="ajitabh";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			char c= s1.charAt(i);
			if(s2.contains(c+"")) {
				if(s2.indexOf(c)==i) {
					count=count+2;
				s2=s2.replaceFirst(c+"", " ");
	
				}
				else {
					count++;
					s2=s2.replaceFirst(c+"", " ");
				}
				
			}
		}
		System.out.println("count ="+count);
	}*/

