import java.util.Scanner;
class ass11task15
{
  public static void main(String args [])
  {
    Scanner er=new Scanner(System.in);
    QuadEqn z=new QuadEqn();
    
    System.out.println("Plese enter values of a, b and c of Quadric equation.");
    int a=er.nextInt();
    int b=er.nextInt();
    int c=er.nextInt();
    int x=z.real(a,b,c);
    if(x==0)
    {
      System.out.println("Don't find any real number quadric equation.");
    }
    else if(x==1)
    {
      System.out.println("Equation is : "+z.equation());
      System.out.println("Value of x : "+z.value(1));
    }
    else if(x==2)
    {
      System.out.println("Equation is : "+z.equation());
      System.out.println("Value of x : "+z.value(1));
      System.out.println("Value of x : "+z.value(-1));
    }
    
    
  }
}