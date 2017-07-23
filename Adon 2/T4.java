//Programmer Sa'd Murshid Khan Adon
import java.util.Scanner;
  public class T4
{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    int x,y,sub;
    System.out.println("Please enter a number");
    x=s.nextInt();
    
    System.out.println("Please enter another number");
    y=s.nextInt();
    
    if (x>y)
    {
      sub=x-y;
    }
    else
    {
      sub=y-x;
    }
    System.out.println("Subtraction = "+sub);
  }
}
