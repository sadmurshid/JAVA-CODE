/*********************************************************************************************************************
  * Programmer  : Sa'd Murshid Khan Adon
  * Sec         : 08
  * ID          : 14301101
  * Subject     : A java program that reads 10 numbers from the user. The program then reads a number between 0  
  *                to 9, and shows the number at the corresponding index number.
  * Date        : 08 July 2014        
  * *****************************************************************************************************************/
import java.util.Scanner;
public class lab8problem2
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    int [] x=new int[10];
    int i=0,z;
    while(i<10)
    {
      System.out.println("Please enter a number.");
      z=er.nextInt();
      x [i]=z;
      i++;
    }
    System.out.println("Please enter the position of the number (it should be 1 to 10)");
    z=er.nextInt();
    if (z<=10 && z>=1)
    {
      System.out.println(" ");
      System.out.println(x[z-1]);
    }
    else
    {
      System.out.println(" Invalid ");
    }
    
  }
}