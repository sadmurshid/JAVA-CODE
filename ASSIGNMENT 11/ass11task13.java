import java.util.Scanner;
class ass11task13
{
  public static void main(String args [])
  {
    Scanner er =new Scanner(System.in);
    int x,y;
    ComplexNumber a= new ComplexNumber();
    
    System.out.println("Plese enter the value of real part.");
    x=er.nextInt();
    System.out.println("Plese enter the value of imaginary part.");
    y= er.nextInt();
    
    a.IncreaseValue(x,y);
    System.out.println(a.toString());
    System.out.println(a.polarRadious());
    
  }
}
