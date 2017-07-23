/*********************************************************************************************************************
  * Programmer  : Sa'd Murshid Khan Adon
  * Sec         : 08
  * ID          : 14301101
  * Subject     : A program which reads 5 numbers into an array and prints the smallest and largest number and their location in the array. 
  *                 their location in the array.   
  * Date        : 08 July 2014        
  * *****************************************************************************************************************/
import java.util.Scanner;
public class lab8task9
{
  public static void main(String[]args)
  {
    Scanner er = new Scanner(System.in);
    int a,b=0,c,d=0,y,z;
    int []x=new int[5];
    for (int i=0; i<5; i++)
    {
      System.out.println("Plese enter a number,");
      x[i]= er.nextInt();
    }
    a=x[0];
    c=x[0];
    for (int i=1; i<x.length; i++)
    {
      if (a<x[i])
      {
        a=x[i];
        b=i;
      }
      if (c>x[i])
      {
        c=x[i];
        d=i;
      }
    }
    
    System.out.println("largest number "+a+" was found at location "+b);
    System.out.println("smallest number "+c+" was found at location "+d);
    
  }
}