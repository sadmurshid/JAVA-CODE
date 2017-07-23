/*
   Programmer : Sa'd Murshid Khan Adon
   Id         : 14301101
   Sec        : 8
   Version    : 1.0.0
                                                              */
import java.util.Scanner;
class ass11task8
{
  public static void main(String args [])
  {
    Scanner er = new Scanner(System.in);

    
    System.out.println("Plese enter the numarical value of month");
    int m=er.nextInt();
    
    System.out.println("Plese enter the date");
    int d= er.nextInt();
    
    System.out.println("Plese enter the year");
    int y= er.nextInt();
    
    date a =new date(m,d,y);

    a.displayDate();
    
  }
}