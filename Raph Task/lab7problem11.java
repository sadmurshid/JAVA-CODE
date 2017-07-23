import java.util.Scanner;
public class lab7problem11
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int x,y,z,c,n=1,i;
    System.out.println("Plese enter a number.");
    y=er.nextInt();

    c=y;
    while (c>0)
    {
    x=c-1;
    while(x>0)
    {
      System.out.print(" ");
      x--;
    }
    z=n;
    i=1;
    while(z>0)
    {
      System.out.print(i);
      i++;
      z--;
    }
    System.out.println();
    n++;
    c--;
    }

  }
}
