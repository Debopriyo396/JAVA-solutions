/*### Question:

**Problem Statement:**

You are given a number `r` representing the number of rows in a card pattern. Each row `i` contains `2*i` cards. You need to calculate the total number of cards in the pattern where:

- The total number of cards is the sum of the cards in each row.
- Additionally, add the sum of integers from `1` to `r-1` to this total.

**Input:**

- A single integer `r` (1 ≤ r ≤ 100), representing the number of rows in the card pattern.

**Output:**

- An integer representing the total number of cards in the pattern.

**Example:**

**Input:**

`4`

**Output:**

`30`

**Explanation:**

For the input `r = 4`:

1. Calculate the total number of cards by summing `2*i` for each row `i` from `1` to `r`:

   - Row 1: `2*1 = 2`
   - Row 2: `2*2 = 4`
   - Row 3: `2*3 = 6`
   - Row 4: `2*4 = 8`

   Total = `2 + 4 + 6 + 8 = 20`

2. Calculate the sum of integers from `1` to `r-1`:

   - Sum of `1 + 2 + 3 = 6`

3. Add the two results: `20 + 6 = 26`

Therefore, the total number of cards is `26`. */
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
