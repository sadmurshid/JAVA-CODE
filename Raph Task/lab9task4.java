/* Programmer : Sa'd Murshid Khan Adon
   ID         : 14301101
   Sec        : 08
   Problem    : Write a java program that reads 20 numbers from the user, and then prints only the even 
                    numbers in reverse order.
   Version    : 1.0.0
                                                                                                            */

import java.util.Scanner;
class lab9task4
{
  public static void main(String[] agrs)
  {
    Scanner er =new Scanner(System.in);
    int[]x=new int[20];
    
    for(int i=0; i<20; i++)
    {
      System.out.println("Plese enter a value.");
      x[i]=er.nextInt();
    }
    
    for (int i=19; i>=0; i--)
    {
     if (x[i]%2==0) 
     {
       System.out.print(x[i]+" , ");
     }
    }
    
  }
}