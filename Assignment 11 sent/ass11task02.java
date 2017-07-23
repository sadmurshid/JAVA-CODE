/*
   Programmer : Sa'd Murshid Khan Adon
   Id         : 14301101
   Sec        : 8
   Version    : 1.0.0
                                                              */
import java.util.Scanner;
class ass11task02
{
  public static void main(String args [])
  {
    Scanner er =new Scanner(System.in);
    double h ,w ,a;
    Square s1= new Square();
    
    // Taking Height
    System.out.println("Plese enter the height.");
    double z=er.nextDouble();
    s1.setHeight(z);
    
    //Taking Width
    System.out.println("Plese enter the width");
    z=er.nextDouble();
    s1.setWidth(z);
    
    //get the value
    h=s1.getHeight();
    w=s1.getWidth();
    a=s1.getArea();
    
    System.out.println("Height = "+ h);
    System.out.println("Width = "+w);
    System.out.println("Area = "+a);
  }
}