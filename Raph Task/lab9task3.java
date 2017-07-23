/* Programmer : Sa'd Murshid Khan Adon
   ID         : 14301101
   Sec        : 08
   Problem    : A java program that reads 10 numbers from the user, and then prints them in the reverse order.
   Version    : 1.0.0
                                                                                                            */

import java.util.Scanner;
class lab9task3
{
  public static void main(String[] agrs)
  {
    Scanner er =new Scanner(System.in);
    int[]x=new int[10];
    
    for(int i=0; i<10; i++)
    {
      System.out.println("Plese enter a value.");
      x[i]=er.nextInt();
    }
    
    for (int i=9; i>0; i--)
    {
      System.out.print(x[i]+" , ");
    }
    System.out.println(x[0]+" .");
  }
}