import java.util.Scanner;
class problem1
{
  public static void main(String [] args)
  {
    Scanner er=new Scanner(System.in);
    
    int t = er.nextInt();
    int v, sum;
    
    
    for(int i=0; i<t; i++)
    {
      v=er.nextInt();
      sum = 0;
      for(int j=1; j<=v; j++)
      {
        sum=sum+(j*j*j);
      }
      System.out.println("Case "+(i+1)+": "+sum);
    }
    
  }
}