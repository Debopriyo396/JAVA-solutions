import java.util.Scanner;

public class StonePS {
  public static void main(String[] args) {
     int i = 0, j = 0, c = 0, max = 0, min = 0, l = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter move: ");
    String s = sc.nextLine();
    if (s == "rock")
      System.out.println("paper"); 
    if (s == "paper")
      System.out.println("scissor "); 
    if (s == "scissor")
      System.out.println("rock "); 
  }
}
