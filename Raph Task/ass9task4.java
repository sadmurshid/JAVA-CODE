import java.util.Scanner;
public class ass9task4
{
  public static void main(String[]args)
  {
    Scanner er =new Scanner(System.in);
    int y=0,z=0,s=0,b=0;
    int[] x = new int [5];
    
    for (int i=0 ;i<5 ;i++)
    {
      System.out.println("Plese enter a number.");
      x[i]= er.nextInt();
    }
    int temp;
    for (int a=0; a<5; a++)
    {
      for(b=a+1; b<x.length; b++)
      {
        if (x[a]>x[b])
        {
          temp = x[b];
          x[b]=x[a];
          x[a]=temp;
        }  
      }
    }
    for (int i=0; i<5; i++)
    {
      System.out.println(x[i]);
    }

  }
}