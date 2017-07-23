/*********************************************************************************************************************
  * Programmer  : Sa'd Murshid Khan Adon
  * Sec         : 08
  * ID          : 14301101
  * Subject     : A java program that reads 10 numbers from the user and prints the last even number in the list.
  *                
  * Date        : 08 July 2014        
  * *****************************************************************************************************************/
import java.util.Scanner;
public class lab8problem6
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    int [] x=new int[10];
    int i=0,z,y=0;
    while(i<10)
    {
      System.out.println("Please enter a number.");
      z=er.nextInt();
      x [i]=z;
      if (z%2==0)
      {
        y = z;
      }
      i++;
    }
    System.out.println(y);
    
    
  }
}