import java.util.Scanner;
class anna3
{
  public static void main(String args[])
  {
    Scanner er=new Scanner(System.in);
    
    System.out.println("Plese entr a number");
    int x=er.nextInt();
    
    int c=0;
    
    for (int i=1; i<=x; i++)
    {
      if(x%i==0)
      {
        System.out.println(x+" is divisible by "+i);
        c++;
      }
      else
      {
        System.out.println(x+" isn't divisible by "+i);
      }
    }
    System.out.println("We find "+c+" factorial of "+x);
  }
}