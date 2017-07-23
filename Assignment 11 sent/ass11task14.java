/*
   Programmer : Sa'd Murshid Khan Adon
   Id         : 14301101
   Sec        : 8
   Version    : 1.0.0
                                                              */
import java.util.Scanner;
class ass11task14
{
  public static void main(String args [])
  {
    Scanner er=new Scanner(System.in);
    point a=new point();
    
    System.out.println("Plese enter the point in the x axis.");
    int x=er.nextInt();
    System.out.println("Plese enter the point in the y axis.");
    int y=er.nextInt();
    
    System.out.println(a.distanceFromOrigin(x,y));
  }
}