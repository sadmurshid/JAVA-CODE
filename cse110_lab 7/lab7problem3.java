import java.util.Scanner;
public class lab7problem3
{
  public static void main(String[]args)
  {
    Scanner er = new Scanner(System.in);
    int x,c,y,b;
    System.out.println("Please enter your favorite number for row .");
    x =er.nextInt();
    System.out.println("Plase enter your favorite number for column .");
    y=er.nextInt();
    b=1;
    c=1;
    while (c<=x)
    {
      b=1;
      while (b<=y)
      {
        System.out.print("*");
        b++;
      }
      System.out.println();
      c++;
    }
  }
}