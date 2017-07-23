/* Programmer : Sa'd Murshid Khan Adon
 * Sec        : 08
 * Id         : 14301101
 * Problem    : Write a java program that reads 10 numbers from the 
 *               user. Write the program in such a way so that if the
 *               user enters 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, then the 
 *               output should be 1, 3, 5, 7, 9, 2, 4, 6, 8, 10.

 * 
 *                                                                 */
import java.util.Scanner;
public class ass9task5
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int y=0,z=0,s=0,a=0,b=5;
    int[] x = new int [10];
    
    for (int i=0 ;i<10 ;i++)
    {
      System.out.println("Plese enter a number.");
      y=er.nextInt();
      if (i%2==0)
      {
        x[a]=y;
        a++;
      }
      else
      {
        x[b]=y;
        b++;
      }
    }
    
    for (int i=0; i<10; i++)
    {
      System.out.println(x[i]);
    }
  }
}