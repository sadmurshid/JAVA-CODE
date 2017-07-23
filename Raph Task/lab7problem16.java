import java.util.Scanner;
public class lab7problem16
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int c,r,z=0;
    
    System.out.println("Plese enter a number.");
    r=er.nextInt();
    
    for(int i=1; i<r; i++)
    {
      for (z=1;z<=i;z++)
      {
        if (z==1||z==i)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }

      
      System.out.println();
    }
    
    if (z==r)
    {
      for (int j=1; j<=r; j++)
      {
        System.out.print("*");
      }
    }
    System.out.println();
  }
}
