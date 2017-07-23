import java.util.Scanner;
class calculator
{
  public static void main(String args[])
  {
    Scanner er=new Scanner(System.in);
    calculation c=new calculation();
    
    System.out.println("Please enter a number.");
    double x= er.nextInt();
    c.setX(x);
    double y;
    
    int a=2;
    for (int i=0; i<a; i++)
    {
      System.out.println("Please enter oparator.");
      String s=er.next();
      if(s=="=")
      {
        System.out.println(c.show());
        break;
      }
      else
      {
        System.out.println("Please enter another number");
        y=er.nextDouble();
        
        if (s=="+")
        {
          c.addition(y);
          a++;
        }
        else if(s=="-")
        {
          c.subtraction(y);
          a++;
        }
        else if(s=="*")
        {
          c.multiplication(y);
          a++;
        }
        else if(s=="/")
        {
          c.division(y);
          a++;
        }
      }
    }
    System.out.println(c.show());
    
  }
}