import java.util.*;

public class autobionum {
    public static void main(String[] args) {
        int i = 0, exp = 0, rem = 0;
        int ans = 0, c = 0;
        boolean r = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        String num = Integer.toString(n);
        int l = num.length();
        int h[] = new int[9];
        for (i = 0; i < l; i++) {
            h[num.charAt(i) - '0']++;
        }
        for (i = 0; i < l; i++) {
            if (num.charAt(i) - '0' != h[i])
                r = false;
        }
        if (r == true) {
            for (i = 0; i < l; i++) {
                if (num.charAt(i) != '0')
                    c++;
            }
        } else
            System.out.println(0);
        System.out.println(c);
    }
}
