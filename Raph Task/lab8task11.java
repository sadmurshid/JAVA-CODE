/*********************************************************************************************************************
  * Programmer  : Sa'd Murshid Khan Adon
  * Sec         : 08
  * ID          : 14301101
  * Subject     : A program which reads 5 numbers into an array, sorts/arranges the numbers from high to low    
  *                 and prints all numbers in the array.
  * Date        : 08 July 2014        
  * *****************************************************************************************************************/
import java.util.Scanner;
public class lab8task11
{
  public static void main(String[]args)
  {
    Scanner er = new Scanner(System.in);
    int a,b ,c;
    int [] x=new int[5];
    for (int i=0; i<5; i++)
    {
      System.out.println("Plese enter a number.");
      x[i]=er.nextInt();
    }
    int temp;
    for (a=0; a<5; a++)
    {
      for (b=a+1; b<5; b++)
      {
        if (x[a]<x[b])
        {
          temp=x[a];
          x[a]=x[b];
          x[b]=temp;
        }
      }
    }
    
    for(int i=0; i<4; i++)
    {
      System.out.print(x[i]+",");
    }
    System.out.println(x[4]);
  }
}