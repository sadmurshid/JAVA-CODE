import java.util.Scanner;
public class t10
{
  public static void main(String[]args)
  {
    Scanner z= new Scanner(System.in);
    int x=1,b=0;
    while (x<=600)
    {
      if (x%7==0)
      {
        b=b+x;
      }
      else
      {
        if (x%9==0)
        {
          b=b+x;
        }
      }
      x=x+1;
    }
    System.out.println(b);
  }

}