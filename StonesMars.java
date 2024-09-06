
/***Question:**

You are given a bag of stones with weights ranging from 1 to `M`. Some of these stones are common with stones on Earth. Write a program to determine the number of stones that can be selected from the bag such that their total weight is at least `M`, but only considering stones that are not common with Earth.

**Input:**
- An integer `M`, the size of the bag and the number of different weights of stones on Mars.
- An integer `N`, the number of common stones on Mars and Earth.
- `N` integers representing the weights of the common stones.

**Output:**
- The number of stones selected whose total weight is at least `M`.

**Example:**

**Input:**
```
10
3
1 3 5
```

**Output:**
```
4
```

**Explanation:**
- Stones weights on Mars are from 1 to 10.
- Common stones are 1, 3, and 5.
- The remaining stones are 2, 4, 6, 7, 8, 9, 10.
- To achieve a total weight of at least 10, you can select stones 2, 4, 6, and 7. The total weight is 19 which exceeds 10.
- The number of selected stones is 4. */
import java.util.Scanner;

public class StonesMars {
  public static void main(String[] args) {
    int i,s=0,c=0,d=0,l=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter M(size of bag, no of different wghts of stones on mars)");
    int m = sc.nextInt();
    System.out.println("Enter N(no of common stones on mars and earth)");
    int n = sc.nextInt();
    int e[] = new int[m];
    int t[]=new int[m];
    for (i = 0; i < m; i++) {
      t[i]=i+1;
    }
    int ms[] = new int[m];
    System.out.println("Enter common stones wieghts");
    for (i = 0; i < n;i++)
      e[i] = sc.nextInt();
    for (i = 0; i < m; i++)
    {
      if (e[i] != t[i])
        ms[i] = t[i];
    }
    l =m-n;
    for (i = 0; i < l;i++)
    {
      d = i;
      s += ms[i];
      if (s >= m) {
        break;
      }
    }
    System.out.println("No of stones selected :"+(d-1));
  }
}
