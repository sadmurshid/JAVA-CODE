/*Author Sad Murshid Khan Adon*/ 
import java.util.Scanner;
 public class T53
{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    double x,y;
    System.out.println("Please enter a number");
    x=s.nextDouble();
    System.out.println("Please enter another number");
    y=s.nextDouble();
      if (x==y)
      {
        System.out.println("Numbers are equal.");
      }
      else
      {
        if (x>y)
        {
          System.out.println("First is greater.");
        }
        else
        {
          System.out.println("Second is greater");
      }
      
      System.out.println("The End");
  }
 }
 }
