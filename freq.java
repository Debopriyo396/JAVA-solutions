import java.util.*;

public class freq {
    public static void main(String[] args) {
        int i = 0, c = 0, max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);
        int n = s.length();
        int h[] = new int[26];
        String ans = "";

        // Count the frequency of each lowercase letter
        for (i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') { // Ensure the character is within 'a' to 'z'
                h[currentChar - 'a']++;
            }
        }

        // Find the most frequent character
        for (i = 0; i < 26; i++) {
            if (h[i] > max) {
                max = h[i];
                c = i;
            }
        }

        char r = (char) (c + 'a');

        // Replace the most frequent character with the specified character
        for (i = 0; i < n; i++) {
            if (s.charAt(i) == r) {
                ans = ans + ch;
            } else {
                ans = ans + s.charAt(i);
            }
        }

        System.out.println("The result: " + ans);
    }
}
