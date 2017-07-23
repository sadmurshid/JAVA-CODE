import java.util.Scanner;
class cse220lab2task7
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    
    point p=new point(er.nextInt(), er.nextInt());
    System.out.println(p.distanceFromOrigin());
    
  }
}