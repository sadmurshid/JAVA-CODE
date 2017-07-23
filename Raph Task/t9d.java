import java.util.Scanner;
public class t9d
{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    int x=2,c=1,a;
    while (c<=5)
    {
      if (c%2==0)
      {
       a=x*(-1);
       System.out.print(a+",");
      }
      else
      {
        System.out.print(x+",");
      }
       
       x=x+2;
       c=c+1;
    }
    System.out.print(-12);
    System.out.println();
    }
  }
