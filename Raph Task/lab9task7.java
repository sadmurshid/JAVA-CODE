/* Programmer : Sa'd Murshid Khan Adon
 * ID         : 14301101
 * Sec        : 08
 * Version    : 1.0.0
 * Problem    : A java program that reads 10 numbers 
 *                from the user. After reading each 
 *                number, print all the numbers that 
 *                have been entered so far.
 *                                                    */

import java.util.Scanner;
class lab9task7
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    int []x=new int[10];
    
    for(int i=0; i<10; i++)              
    {
      // Taking input
      System.out.println("Plese enter a number.");
      x[i]=er.nextInt();
      
      //Printing so far entered Number
      for(int j=0; j<i; j++)   
      {
        System.out.print(x[j]+" , ");
      }
      System.out.println(x[i]+" . ");
      
    }
    
  }
}