/* Programmer : Sa'd Murshid Khan Adon
 * Id         : 14301101
 * Section    : 08
 * Virsion    : 1.0.0
 * Subject    : A java program that reads 10 numbers from the user.
 *                Then read another number from the user, and print 
 *                “yes” if this number exists among the first 10. 
 *                Print “no” otherwise.
 *                                                                */

import java.util.Scanner;
class lab9task5
{
  public static void main(String[] args)
  {
    Scanner er = new Scanner(System.in);
    int [] x =new int [10];
    int y,c=0;
    for(int i=0; i<10; i++)          //Taking input
    {
      System.out.println("Plese enter a number.");
      x[i]=er.nextInt();
    }
    
    // Ask user which number he want to chack
    System.out.println("Plese enter a number to check whether you entered it before or not.");
    y=er.nextInt();
    
    // Checking that if he entered that number before
    for (int i=0; i<10; i++)
    {
      if (x[i]==y)
      {
        System.out.println("Yes");
        c=1;
        break;
      }
    }
    
    if (c==0)
    {
      System.out.println("No");
    }
  }
}