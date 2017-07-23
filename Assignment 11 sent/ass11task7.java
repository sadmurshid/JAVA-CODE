/*
   Programmer : Sa'd Murshid Khan Adon
   Id         : 14301101
   Sec        : 8
   Version    : 1.0.0
                                                              */
import java.util.Scanner;
class ass11task7
{
  public static void main(String args [])
  {
    Scanner er = new Scanner(System.in);
    Cube c=new Cube();
    System.out.println("Plese enter the value of a arm of Cube");
    int a=er.nextInt();
    c.setArm(a);
    c.printVolume();
  }
}