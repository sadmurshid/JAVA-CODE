/*
   Programmer : Sa'd Murshid Khan Adon
   Id         : 14301101
   Sec        : 8
   Version    : 1.0.0
                                                              */
import java.util.Scanner;
class ass11task6
{
  public static void main(String args [])
  {
    Scanner er = new Scanner(System.in);

    System.out.println("Plese enter the size of the row matrix.");
    int a = er.nextInt();
    int [] x= new int [ a];
    int [] y= new int [ a];
    int b=a;
    
    System.out.println("Now enter the values of 1st matrix.");
    // set x
    for (int i=0; i<a; i++)
    {
      System.out.println("Plese enter a number.");
      x[i]=er.nextInt();
      
    }
    
    a=b;
    System.out.println("Now enter the values of 2nd matrix");
    //set y
    for (int i=0; i<a; i++)
    {
      System.out.println("Plase enter a number.");
      y[i]=er.nextInt();
      
    }
    
    // 5x
    for (int i=0; i<a; i++)
    {
      x[i]=5*x[i];
    }
    
    a=b;
    //new array
    int [] z=new int[a];
    
    for(int i=0; i<a; i++)
    {
      z[i]=x[i]+y[i];
    }
    // Printing Matrix
    for (int i=0; i<a; i++)
    {
      System.out.print(z[i]);
      System.out.print(" ");
    }
    System.out.println();
    
    
  }
}