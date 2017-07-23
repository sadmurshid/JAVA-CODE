import java.util.Scanner;
public class lab7problem15
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int c,r,j;
    
    System.out.println("Plese enter the number of row.");
    r=er.nextInt();
    
    System.out.println("Plese enter the number of row.");
    c=er.nextInt();
    
    for(int i=1; i<=r; i++)
    {
      if (i==1)
      {
        for (j=1; j<=c; j++)
        {
          System.out.print(j);
        }
      }
      else if (i==r)
      {
        for (j=1; j<=c; j++)
        {
          System.out.print(j);
        }
      }
      else
      {
        for (j=1; j<=c; j++)
        {
          if(j==1)
          {
            System.out.print(j);
          }
          else if(j==c)
          {
            System.out.print(j);
          }
          else
          {
            System.out.print(" ");
          }
        }
          
      }
      System.out.println();
    }
  }
}
