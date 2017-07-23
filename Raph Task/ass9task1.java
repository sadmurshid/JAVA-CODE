import java.util.Scanner;
public class ass9task1
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int y,z,a;
    System.out.println("Plese enter the number of the array.");
    y= er.nextInt();
    int [] x=new int[y];
    
    for (int i=0 ; i<y ;i++)
    {
      System.out.println("Please enter a number.");
      x [i]=er.nextInt();
    }
    if (x[0]==6)
    {
      System.out.println("true");
    }
    else if (x[y-1]==6)
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }
  }
}