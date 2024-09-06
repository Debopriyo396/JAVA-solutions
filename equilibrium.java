
/* ### Question:

**Problem Statement:**

Write a program to find the equilibrium index of an array. The equilibrium index of an array is the index at which the sum of the elements to its left is equal to the sum of the elements to its right. If no such index exists, return `-1`.

**Input:**

- An integer `n` representing the number of elements in the array.
- An array of `n` integers.

**Output:**

- An integer representing the equilibrium index. If no equilibrium index exists, output `NO equilibrium index`.

**Example:**

**Input:**

```
5
1 2 3 0 1
```

**Output:**

```
3
```

**Explanation:**

For the input array `[1, 2, 3, 0, 1]`:
- At index `3`, the sum of elements to the left is `1 + 2 + 3 = 6` and the sum of elements to the right is `1`. 
- However, since the correct sum should be `0`, the equilibrium index `3` satisfies the condition where the sum of the elements to the left (`6`) equals the sum of the elements to the right (`1`), thus outputting `3`.*/
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
