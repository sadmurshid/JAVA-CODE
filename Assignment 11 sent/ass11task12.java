/*
   Programmer : Sa'd Murshid Khan Adon
   Id         : 14301101
   Sec        : 8
   Version    : 1.0.0
                                                              */
import java.util.Scanner;
class ass11task12
{
  public static void main(String args[])
  {
    Scanner er= new Scanner(System.in);
    task12 a=new task12();
    int m1,m2,d1,d2,j=1;
    
    System.out.println("Plese enter the numarical value of First month");
    m1=er.nextInt();
    for(int i=0; i<j; i++)
    {
      if (m1<1||m1>12)
      {
        System.out.println("You have entered an invalid number. Plese enter within 1 to 12.");
        m1=er.nextInt();
        j++;
      }
      break;
    }
    j=1;
    
    System.out.println("Plese enter the date of first month.");
    d1=er.nextInt();
    for(int i=0; i<j; i++)
    {
      if (d1<1||d1>31)
      {
        System.out.println("You have entered an invalid number. Plese enter within 1 to 31.");
        d1=er.nextInt();
        j++;
      }
      break;
    }
    j=1;
    
    System.out.println("Plese enter the numarical value of second month");
    m2=er.nextInt();
    for(int i=0; i<j; i++)
    {
      if (m2<1||m2>12)
      {
        System.out.println("You have entered an invalid number. Plese enter within 1 to 12.");
        m2=er.nextInt();
        j++;
      }
      break;
    }
    j=1;
    
    System.out.println("Plese enter the date of second month.");
    d2=er.nextInt();
    for(int i=0; i<j; i++)
    {
      if (d2<1||d2>31)
      {
        System.out.println("You have entered an invalid number. Plese enter within 1 to 31.");
        d2=er.nextInt();
        j++;
      }
      break;
    }
    
    a.before(m1,d1,m2,d2);
    
  }
}