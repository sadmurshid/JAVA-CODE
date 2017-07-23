/*********************************************************************************************************************
  * Programmer  : Sa'd Murshid Khan Adon
  * Sec         : 08
  * ID          : 14301101
  * Subject     : A java program that would input three numbers from the user and print sum, then the first 
  *                 number, then the 2nd number followed by 3rd number.
  * Date        : 08 July 2014        
  * *****************************************************************************************************************/
import java.util.Scanner;
public class lab8problem1
{
  public static void main(String[]args)
  {
    Scanner er = new Scanner(System.in);
    int [] x=new int [3];
    int i=0,s=0, c=1,y;
    while(c<=3)
    {
      System.out.println("Please enter a number");
      y=er.nextInt();
      x[i]=y;
      i++;
      c++;
    }
    s=x[0]+x[1]+x[2];
    System.out.println(s);
    c=1;
    i=0;
    while(c<=3)
    {
      System.out.println(x[i]);
      i++;
      c++;
    }
  }
}