import java.util.Scanner;
public class lab7problem2
{
  public static void main(String[]args)
  {
    Scanner er = new Scanner(System.in);
    int x,c;
      System.out.println("Please enter your favorite number.");
    x =er.nextInt();
    c=1;
    while (c<=x)
    {
      System.out.print("*");
      c++;
    }
    System.out.println();
  }
}