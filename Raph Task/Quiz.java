/* Programmer : Sa'd Murshid Khan Adon
 * Id         : 14301101
 * Sec        : 08
 * Version    : 1.0.0
 *                                                               */

import java.util.Scanner;
class Quiz
{
  public static void main(String[] args)
  {
    Scanner er =new Scanner(System.in);
    System.out.println("Please enter the row of matrix.");
    int y=er.nextInt();
    int [] []x=new int [y] [1];
    for(int i=0; i<y; i++)
    {
      System.out.println("Plese enter a value.");
      x[i] [0]=er.nextInt();
    }
    
    int temp;                 // Sorting
    for (int a=0; a<y; a++)
    {
      for (int b=a+1; b<y; b++)
      {
        if (x[a][0]<x[b][0])
        {
          temp=x[a][0];
          x[a][0]=x[b][0];
          x[b][0]=temp;
        }
      }
    }
    for (int i=0; i<y; i++)   //Printing matrix in Desending order
    {
      System.out.print(x[i][0]+" , ");
    }
    
    System.out.println("Do you want to increse matrix? If yes press 1 otherwise press 2.");
    int a =er.nextInt();
    if (a == 1)
    {
      int c=2*y;
      int [] [] z=new int [c] [1];
      
      //coping x to z
      for(int i=0; i<y; i++)
      {
        z [i][0]=x[i][0];
      }
      
      for (int i=c-y-1; i<c; i++)     //Taking new value
      {
        System.out.println("Plese enter a value.");
        z[i][0]=er.nextInt();
      }
      //SORTING assending
      for(int b=0; b<c; b++)
      {
        for(int d=b+1; d<c; d++)
        {
          if (z[b][0]>z[d][0])
          {
            temp= z[b][0];
            z[b][0]=z[d][0];
            z[d][0]=temp;
          }
        }
      }
      // Printing matrix in assendig order
      for(int i=0; i<c; i++)
      {
        System.out.print(z[i][0]+" , ");
      }
      
    }
    
    
    
  }
}