import java.util.Scanner;
public class lab7problem7
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    int x,y,z,a;
    System.out.println("Please enter a number.");
    x = er.nextInt();
    y=x;
    while(y>0)
    {
      z=1;
      while(z<y)
      {
        System.out.print(" ");
        z++;
      }
      if(z==y)
      {
        System.out.print("*");
      }
      a=x-y;
      while(a>0)
      {
        System.out.print("*");
        a--;
      }
      System.out.println();
      y--;
      
    }
  }
}