import java.util.Scanner;
public class ass9task5
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int y=0,z=0,s=0,a=0,b=5;
    int[] x = new int [10];
    
    for (int i=0 ;i<10 ;i++)
    {
      System.out.println("Plese enter a number.");
      y=er.nextInt();
      if (i%2==0)
      {
        x[a]=y;
        a++;
      }
      else
      {
        x[b]=y;
        b++;
      }
    }
    
    for (int i=0; i<10; i++)
    {
      System.out.println(x[i]);
    }
  }
}