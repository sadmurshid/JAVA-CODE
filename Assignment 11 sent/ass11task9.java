/*
   Programmer : Sa'd Murshid Khan Adon
   Id         : 14301101
   Sec        : 8
   Version    : 1.0.0
                                                              */
import java.util.Scanner;
class ass11task9
{
  public static void main(String aegs [])
  {
    Scanner er=new Scanner(System.in);
    task9 a= new task9();
    int [] x=new int[10];
    for(int i=0; i<10; i++)
    {
      System.out.println("Plese enter a number.");
      x[i]=er.nextInt();
    }
    a.display(x,x.length);
    x=a.square(x,x.length);
    a.display(x,x.length);
      
    
    
  }
  
}