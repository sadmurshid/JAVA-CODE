import java.util.Scanner;
class anna4
{
  public static void main(String agrs[])
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Plese enter the lowest point.");
    int x=er.nextInt();
    System.out.println("Plese enter the highest point.");
    int y=er.nextInt();
    
    int c1=0;
    for(int i=x; i<=y; i++)
    {
      int c=0;
      for(int j=1; j<i; j++)
      {
        if (i%j==0)
        {
          c++;
        }
      }
      if(c>1)
      {}
      else
      {
        System.out.println(i+" is a prime number.");
        c1++;
      }
    }
    
    System.out.println("We find "+c1+" prime number within "+x+" to "+y);
    
  }
}