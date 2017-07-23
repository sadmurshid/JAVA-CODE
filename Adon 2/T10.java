//Programmer Sad Murshid Khan Adon
import java.util.Scanner;
public class T10
  {
    public static void main(String[]args)
    {
    Scanner s=new Scanner(System.in);
    int x;
    System.out.println("Please enter a number .");
    x=s. nextInt();
    if (x>=90)
    {
      System.out.println("A");
      
    }
    else
    {
      if(x>=80)
      {
        System.out.println("B");
      }
      else
      {
        if (x>=70)
        {
          System.out.println("C");
        }
        else
        {
          if (x>=60)
          {
            System.out.println("D");
          }
          else
          {
            if (x>=50)
            {
              System.out.println("E");
            }
            else
            {
              System.out.println("F");
            }
          }
      }
    }
    }
}
}
