/* Programmer : Sa'd Murshid Khan Adon
 * Sec        : 08
 * Id         : 14301101
 * Problem    : Write a java program that would input three numbers 
 *               from the user and print sum, then the first number,
 *                then the 2nd number followed by 3rd number.   
 *                                                                 */
import java.util.Scanner;
public class ass9task2
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int y,z,s=0;
    int[] x = new int [3];
    
    for (int i=0; i<3; i++)
    {
      System.out.println("Plase enter a number.");
      x [i]= er.nextInt();
      if (i==0)
      {
        s=x[0];
      }
      else
      {
        s=s+x[i];
      }
      
    }
    System.out.println(s);
    for (y=0; y<3; y++)
    {
      System.out.println(x[y]);
    }
  }
}