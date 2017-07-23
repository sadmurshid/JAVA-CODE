/* Programmer : Sa'd Murshid Khan Adon
 * ID         : 14301101
 * Sec        : 08
 * Version    : 1.0.0
 * Problem    : A java program that reads 10 numbers from the user,
 *                but does not allow the user to enter duplicates. 
 *                                                                 */

import java.util.Scanner;
class lab9task8
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    int [] x=new int [10];
    int c=0,y,a;
    
    while (c<10)
    {
      System.out.println("Plese enter a number.");
      y=er.nextInt();
      a=0;
      
      for(int i=0; i<=c; i++)
      {
        if (x[i]==y)
        {
          System.out.println(" ");
          System.out.println("You can't enter same number twice.");
          System.out.println(" ");
          a=1;
          break;
        }
      }
      if(a!=1)
      {
        x[c]=y;
        c++;
      }
    }
    
    
  }
}