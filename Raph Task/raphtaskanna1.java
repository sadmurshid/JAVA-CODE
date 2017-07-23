/* Programmer : Sa'd Murshid Khan Adon
   Id         : 14301101
   Problem    : A program will read an array and sort only largest and Smallest number.
   Virsion    : 1.0.0                                                                 */

import java.util.Scanner;
class raphtaskanna1
{
  public static void main(String args [])
  {
    Scanner er = new Scanner(System.in);
    
    System.out.println("Please enter the size of the array.");
    int a=er.nextInt();
    int [] x =new int [a];
    for (int i=0; i<a; i++)
    {
      System.out.println("Plese enter a value.");
      x[i]= er.nextInt();
    }
    
    
  }
}