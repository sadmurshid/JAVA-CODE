import java.util.Scanner;
public class lab7problem13
{
  public static void main(String[]args)
  {
Scanner er =new Scanner(System.in);
    int x,y,z,c,n=1,i,b;
    
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
    z=2*n-1;
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
    
    i=y-1;
    for(c=1; c<=y-1; c++)
    {
      b=y-i;
      for(x=1; x<=c; x++)
      {
        System.out.print(" ");
      }
      i=1;
      for(x=1;x<=2*y-2*c -1;x++)
      {
        System.out.print(i);
        i++;
      }
      System.out.println();
      
    }
  }
}
