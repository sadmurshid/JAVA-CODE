import java.util.Scanner;
class Not_Easy_But_Not_Hard
{
  public static void main(String[] args)
  {
    Scanner er= new Scanner(System.in);
    
    int t=er.nextInt();
    int n,j;
    long sum;
    
    for(int i=1; i<=t; i++)
    {
      n=er.nextInt();
      sum=0;
      if(n<=10)
      {
        for(j=1; j<=n; j++)
        {
          sum=sum+j;
        }
      }
      else if(n<=100)
      {
        sum=55;
        for(j=11; j<=n; j++)
        {
          sum=sum+j;
        }
      }
      else if(n<=1000)
      {
        sum=5050;
        for(j=101; j<=n; j++)
        {
          sum=sum+j;
        }
      }
      else if(n<10000)
      {
        sum=500500;
        for(j=1001; j<=n; j++)
        {
          sum=sum+j;
        }
      }
      else
      {
        sum=50005000;
        for(j=10001; j<=n; j++)
        {
          sum=sum+j;
        }
      }
      System.out.println(sum);
    }
    
    
  }
}