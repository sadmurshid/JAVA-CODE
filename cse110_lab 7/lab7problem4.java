import java.util.Scanner;
public class lab7problem4
{
  public static void main(String[]args)
  {
    Scanner er = new Scanner(System.in);
    int x,y,z,a;
    System.out.println("Please enter the row number.");
    x=er.nextInt();
    System.out.println("Please enter the column number.");
    y = er.nextInt();
    z=1;
    a=1;
    while (z<=x)
    {
      a=1;
      while(a<y)
      {
        System.out.print(a);
        a++;
      }
      if (a==y)
      {
        System.out.println(a);
      }
      z++;
    }
  }
}