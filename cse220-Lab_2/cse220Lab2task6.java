import java.util.Scanner;
class cse220Lab2task6
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the real part and then imaginary part in int");
    ComplexNumber a=new ComplexNumber(er.nextInt(), er.nextInt());
    System.out.println("Your entered complex number is : "+a);
    a.increaseValue();
    System.out.println("After increasing each part 2 unit : "+a);
    System.out.println("Polar radious of the Complex number is : "+a.polarRadius());
  }
}