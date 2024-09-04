import java.util.Scanner;

public class notation {
    public static void main(String[] args) {
        int rem = 0;
        String ans = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Enter base to convert to: ");
        int n = sc.nextInt();

        while (num != 0) {
            rem = num % n;
            num = num / n;
            ans = nott(rem) + ans;
        }

        System.out.println("Result: " + ans);
    }

    static char nott(int rem) {
        String n = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (rem >= 0 && rem < 36) {
            return n.charAt(rem);
        }
        return ' ';
    }
}
