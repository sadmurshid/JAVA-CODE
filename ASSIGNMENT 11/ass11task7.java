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