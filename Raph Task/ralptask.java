/*   Made by Sa'd Murshid Khan Adon
 *   ID 14301101
 *   Section 08
 *   Made to read an array and decide whether the array is palindrom or not.
 *   Here 'b' is taken as a counter. 
 *                                                                           */

import java.util.Scanner;
class ralptask
{
  public static void main(String[] args)
  {
    Scanner er= new Scanner(System.in);
    int y,z,a,b=0,c;
    System.out.println("Plese enter how much number will you give.");
    y=er.nextInt();
    int []x=new int[y];
    
    //Input numbers
    for (int i=0; i<y; i++)
    {
      System.out.println("Plese enter a number.");
      x[i]=er.nextInt();
    }
    
    if (y%2==0)                               // If y is even
    {
      a=y/2-1;
      c=a;
      while(x[a-c]==x[a+c+1]&&c>=0)
      {
        c--;
        b++;
      }
    }
    else                                     // If y is odd
    {
      a=(y-1)/2;
      c=a;
      while(x[a-c]==x[a+c]&&c>0)
      {
        c--;
        b++;
      }
    }
    if (b==a)
    {
      System.out.println("Your entered number is a polydromic number.");
    }
    else
    {
      System.out.println("Your entered number is not a polydromic number.");
    }

    
  }
  
}