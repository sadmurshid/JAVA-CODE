/*Programmer Sa'd Murshid Khan Adon*/
import java.util.Scanner;
public class T6
{
  public static void main(String[]args)
  {
    Scanner s = new Scanner(System.in);
    int x;
    System.out.println("Please enter a number");
    x=s.nextInt();
    
    if (x%2==0)
    {
      System.out.println("The number is Even");
    }
    else
    {
      System.out.println("The number is Odd");
    }
  }
}