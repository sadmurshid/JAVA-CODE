/*Author Sad Murshid Khan Adon*/ 
import java.util.Scanner;
 public class T52
{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    double x,y;
    System.out.println("Please enter a number");
    x=s.nextDouble();
    System.out.println("Please enter another number");
    y=s.nextDouble();
      if (x>y)
      {
        System.out.println("First is greater.");
      }
      else
      {
        System.out.println("First is not greater.");
      }
      System.out.println("The End");
  }
 }
