/* Programmer : Sa'd Murshid Khan Adon
 * Sec        : 08
 * Id         : 14301101
 * Problem    : Write a Java program that would ask the user to 
 *                enter ten numbers. As the user enters the ten 
 *                numbers the program will make sure that all the 
 *                numbers entered by the user are unique.
 * 
 *                                                                 */
import java.util.Scanner;
public class ass9task7
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int y=0,z=0,s=0,a=0,b=5;
    int[] x = new int [10];
    
    System.out.println("Plese enter a number.");
    x[0]=er.nextInt();
    
    int i=1;
    while (i<10 )
    {
      System.out.println("Plese enter a number.");
      x[i]=er.nextInt();
      
      a=0;
      
      while (a<i)
      {
        y=x[a];
        z=x[i];
        if (y==z)
        {
          System.out.println("You have enter this number bofore. Plese enter a new number.");
          System.out.println("Plese enter a number.");
          x[i]=er.nextInt(); 
        }
        a++;
      }
      i++;
    }

  }
}