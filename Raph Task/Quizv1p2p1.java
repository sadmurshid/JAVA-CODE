/* Programmer : Sa'd Murshid Khan Adon
 * Id         : 14301101
 * Sec        : 08
 * Version    : 1.2.1
 *                                                               */

import java.util.Scanner;
class Quizv1p2p1
{
  public static void main(String[] args)
  {
    Scanner er =new Scanner(System.in);
    System.out.println("Please enter the row of matrix.");
    int y=er.nextInt();
    int [] []x=new int [1] [y];
    for(int i=0; i<y; i++)
    {
      System.out.println("Plese enter a value.");
      x[0] [i]=er.nextInt();
    }
    
    int temp;                 // Sorting
    for (int a=0; a<y; a++)
    {
      for (int b=a+1; b<y; b++)
      {
        if (x[0][a]<x[0][b])
        {
          temp=x[0][a];
          x[0][a]=x[0][b];
          x[0][b]=temp;
        }
      }
    }
    for (int i=0; i<y; i++)   //Printing matrix in Desending order
    {
      System.out.print(x[0][i]+" , ");
    }
    
    System.out.println("Do you want to increse matrix? If yes press 1 otherwise press 2.");
    int a =er.nextInt();
    if (a == 1)
    {
      int c=2*y;
      int [] [] z=new int [1] [c];
      
      //coping x to z
      for(int i=0; i<y; i++)
      {
        z [0][i]=x[0][i];
      
      }
     //Here is the change: ab<c
      for (int ab=y; ab<c; ab++)     
      {
        System.out.println("Plese enter a value.");
        z[0][ab]=er.nextInt();
      
      }
      //SORTING assending
      for(int b=0; b<c; b++)
      {
        for(int d=b+1; d<c; d++)
        {
          if (z[0][b]>z[0][d])
          {
            temp= z[0][b];
            z[0][b]=z[0][d];
            z[0][d]=temp;
          }
        }
      }
      // Printing matrix in assendig order
      for(int i=0; i<c; i++)
      {
        System.out.print(z[0][i]+" , ");
      }
      
    }
    
    
    
  }
}