/* Programmer : Sa'd Murshid Khan Adon
 * Sec        : 08
 * Id         : 14301101
 * Problem    : Read in 10 input from the keyboard, and store them 
 *                 in an array. Find the position (or index) of the 
 *                 maximum and minimum values in the array, and swap 
 *                 them (move the biggest element to the position of
 *                 the smallest, and move the smallest element to
 *                 the position of the biggest) and print that again.
 * 
 *                                                                 */
import java.util.Scanner;
public class ass9task3
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int y=0,z=0,max , min;
    int[] x = new int [10];
    
    for(int i=0; i<10; i++)
    {
      System.out.println("Plese enter a number.");
      x[i]=er.nextInt();
    }
    max=x[0];
    min=x[0];
    for (int i=0; i<10; i++)
    {
      if (max<x[i])
      {
        max=x[i];
        y=i;
      }
      if(min>x[i])
      {
        min=x[i];
        z=i;
      }
    }
    x[z]=max;
    x[y]=min;
    for (int i=0; i<9; i++)
    {
      System.out.print(x[i]+",");
    }
    System.out.println(x[9]);
    
  }
}