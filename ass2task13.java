import java.util.Scanner;
class ass2task13
{
  public static void main(String args[])
  {
    Scanner er=new Scanner(System.in);
    int []x=new int[10];
    
    for(int i =0; i<10; i++)
    {
      System.out.println("Please enter a number.");
      x[i]= er.nextInt();
    }
    
    int max=x[0];
    int min=x[0];
    int maxloc=0;
    int minloc=0;
    for(int i=0; i<10; i++)
    {
      if(max<x[i])
      {
        max=x[i];
        maxloc=i;
      }
      else if(min>x[i])
      {
        min=x[i];
        minloc=i;
      }
    }
    
    System.out.println("Maximum number : "+max+" and Location : "+maxloc);
    System.out.println("Minimum number : "+min+" and Location : "+minloc);
    
    
  }
}