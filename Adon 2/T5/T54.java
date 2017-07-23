//Programmer Sa'd Murshid Khan Adon
import java.util.Scanner;
  public class T54
{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    double x,y,sub;
    System.out.println("Please enter a number");
    x=s.nextDouble();
    
    System.out.println("Please enter another number");
    y=s.nextDouble();
    
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
