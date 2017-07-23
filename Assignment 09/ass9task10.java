/* Programmer : Sa'd Murshid Khan Adon
 * Sec        : 08
 * Id         : 14301101
 * Problem    : Read 10 input from the user, and store them in an array.
 *                Then ask the user to give another input between 0 
 *                and 9 for choosing an array cell. Display a line with
 *                that many "*" characters.
 * 
 *                                                                 */
import java.util.Scanner;
public class ass9task10
{
  public static void main(String[]args)
  {
    Scanner er = new Scanner(System.in);
    int []x=new int[10];
    int a,b,y;
    for (int i=0; i<10; i++)
    {
      System.out.println("Plese enter a number");
      x[i]= er.nextInt();
    }
    System.out.println("Plese enter the location of the number.");
    y=er.nextInt();
    b=x[y];
    for (int i=0; i<b; i++)
    {
      System.out.print("*");
    }
    System.out.println();
  }
}