import java.util.Scanner;
class anna2010Summer161Quiz6
{
  public static void main(String args [])
  {
    Scanner er=new Scanner(System.in);
    int x,y,z;
    int sum;
    System.out.println("Please enter 1st number.");
    x=er.nextInt();
    System.out.println("Please enter 2nd number.");
    y=er.nextInt();
    System.out.println("Please enter 3rd number.");
    z=er.nextInt();
    if (x%2!=0)
    {
      sum=x+y+z;
      System.out.println("Sum rule1 : "+sum);
    }
    else if (y%7==0)
    {
      int pro=x*z;
      System.out.println("Product rule2 : "+pro);
    }
    else if(z!=0)
    {
      System.out.println(x);
    }
    else 
    {
      System.out.println("Could not satisfy any rule");
    }
  }
}
