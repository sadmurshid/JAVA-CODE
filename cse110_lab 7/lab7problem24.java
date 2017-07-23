import java.util.Scanner;
public class lab7problem24
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int c,r,z=0;
    
    System.out.println("Plese enter a number.");
    r=er.nextInt();
    
    for (int i=1; i<r; i++)
    {
      System.out.print(i);
    }
    
    for(int i=r; i>0; i--)
    {
      System.out.print(i);
    }
    System.out.println();
    
  }
}
