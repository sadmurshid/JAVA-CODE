/* Programmer : Sa'd Murshid Khan Adon
 * Id         : 14301101
 * Sec        : 08 
 * Problem    : Write a Java program that would ask the user to enter 15 
 *                 numbers. All the numbers are between 0 to 9. 
 *                 The program should count how many time the number been given.
 *                                                                               */

import java.util.Scanner;
class ass9task8
{
  public static void main(String[] args)
  {
    Scanner er =new Scanner(System.in);
    int []x =new int [15];
    
    for(int i=0; i<15; i++)
    {
      System.out.println("Plese enter a number within o to 9.");
      x[i]=er.nextInt();
    }
    int a;
    for (int i=0; i<10; i++)
    {
      a=0;
      for (int j=0; j<15; j++)
      {
        if (x[j]==i)
        {
          a++;
        }
      }
      System.out.println(i+" was found "+a+" times ");
    }
  }
  
}