/*********************************************************************************************************************
  * Programmer  : Sa'd Murshid Khan Adon
  * Sec         : 08
  * ID          : 14301101
  * Subject     : A program which reads 5 numbers into an array and prints the largest number.
  *                
  * Date        : 08 July 2014        
  * *****************************************************************************************************************/
import java.util.Scanner;
public class lab8problem7
{
  public static void main(String[]args)
  {
    Scanner er = new Scanner(System.in);
    int [] x = new int[5];
    int i=0,y,z,a;
    
    System.out.println("Please enter a number. ");
    y =er.nextInt();
    x[0] =y;
    i++;
    z=y;
    while(i<5)
    {
       System.out.println("Please enter a number. ");
       y =er.nextInt();
       x [i]=y;
       if(y>z)
       {
         z=y;
       }
       i++;
    }
    System.out.println(z);
  }
}