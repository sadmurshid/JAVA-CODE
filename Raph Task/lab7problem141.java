import java.util.Scanner;
public class lab7problem141
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
        if(c==1 || c==x || b==1|| b==y)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
          
        b++;
      }
      System.out.println();
      c++;
    }
  }
}