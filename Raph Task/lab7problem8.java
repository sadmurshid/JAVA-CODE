import java.util.Scanner;
public class lab7problem8
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    int x,y,z,a,b;
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
        System.out.print("1");
      }
      a=x-y;
      b=2;
      while(a>0)
      {
        System.out.print(b);
        b++;
        a--;
      }
      System.out.println();
      y--;
      
    }
  }
}