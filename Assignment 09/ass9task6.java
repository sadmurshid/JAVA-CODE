/* Programmer : Sa'd Murshid Khan Adon
 * Sec        : 08
 * Id         : 14301101
 * Problem    : Write a program which reads 5 numbers into an array, 
 *                sorts/arranges the numbers from low to high and prints
 *                all numbers in the array and the even number in that list
 * 
 * 
 *                                                                 */
import java.util.Scanner;
public class ass9task6
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int y=0,z=0,s=0,a=0,b=5;
    int[] x = new int [5];
    
    for (int i=0 ;i<5 ;i++)
    {
      System.out.println("Plese enter a number.");
      x[i]=er.nextInt(); 
    }

    for ( a=0; a<5; a++)
    {
      for (b=a+1; b<5; b++)
      {
        if (x[a]<x[b])
        {
          int temp=x [b];
          x[b]=x[a];
          x[a]=temp;
        }
      }
    }
    for(int i=0; i<5; i++)
    {
      System.out.println(x[i]);
    }
    for (int i=0; i<5; i++)
    {
      if(x[i]%2==0)
      {
        System.out.println(x[i]);
      }
    }
  }
}