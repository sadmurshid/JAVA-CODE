/* Programmer : Sa'd Murshid Khan Adon
 * ID         : 14301101
 * Sec        : 08
 * Version    : 1.0.0
 * Problem    : A java program that reads 10 numbers from the user. Write the program in such a way so that 
  if the user enters 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, then the output should be 1, 3, 5, 7, 9, 2, 4, 6, 8, 10.
 
 *                                                                 */

import java.util.Scanner;
class lab9task9
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    int [] x=new int[10];
    
    for(int i=0; i<10; i++)
    {
      System.out.println("Plese enter a number.");
      x[i]=er.nextInt();
    }
    
    for(int i=0; i<10; i++)
    {
      if (i%2==0)
      {
        System.out.print(x[i]+" , ");
      }
    }
    for (int i=0; i<9;i++)
    {
      if(i%2==1)
      {
        System.out.print(x[i]+" , ");
      }
    }
    System.out.println(x[9]+" .");
    
  }
}