import java.util.Scanner;
public class lab7problem14
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int c,r,j;
    
    System.out.println("Plese enter the number of row.");
    r=er.nextInt();
    
    System.out.println("Plese enter the number of row.");
    c=er.nextInt();
    
    for(int i=0; i<r; i++)
    {
      if (i==0)
      {
        for (j=0; j<c; j++)
        {
          System.out.print("*");
        }
      }
      else if (i==(r-1))
      {
        for (j=0; j<c; j++)
        {
          System.out.print("*");
        }
      }
      else
      {
        for (j=0; j<c; j++)
        {
          if(j==0)
          {
            System.out.print("*");
          }
          else if(j==(c-1))
          {
            System.out.print("*");
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
