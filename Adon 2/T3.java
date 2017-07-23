/*Author Sad Murshid Khan Adon*/ 
import java.util.Scanner;
 public class T3
{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    int x,y;
    System.out.println("Please enter a number");
    x=s.nextInt();
    System.out.println("Please enter another number");
    y=s.nextInt();
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
