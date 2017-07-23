/*Programmer Sa'd Murshid Khan Adon*/
import java.util.Scanner;
public class T7
{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    int x;
    System.out.println("Please enter a number");
    x= s.nextInt();
    if (x>10)
    {if (x%2==0)
      {
      System.out.println("An even number greater than 10");
    }
    else
    {
      System.out.println("An odd number greater than 10");
    }
    }
    else
    {
      if (x%2==0)
      {
        System.out.println("An even number less then 10");
      }
      else
      {
        System.out.println("An odd number less thsn 10");
      }
    }
    }
  }