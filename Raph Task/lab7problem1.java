import java.util.Scanner;
public class lab7problem1
{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    int x,y;
    System.out.println("Plase enter your favorite number.");
    x=s.nextInt();
    y=1;
    while (y<x)
    {
      System.out.print(y);
      y++;
    }
    if (y==x)
    {
      System.out.println(y);
    }
  }
}