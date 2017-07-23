import java.util.Scanner;
class cse220lab1task12
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    int m1, d1, m2, d2;
    
    System.out.println("Please enter the 1st month");
    m1=er.nextInt();
    System.out.println("Please enter the 1st date");
    d1=er.nextInt();
    System.out.println("Please enter the 2nd month");
    m2=er.nextInt();
    System.out.println("Please enter the 2nd date");
    d2=er.nextInt();
    
    System.out.println(before(m1,d1,m2,d2));
  }
  
  public static boolean before(int m1, int d1, int m2, int d2)
  {
    boolean de=false;
    if((m1<m2)||((m1==m2)&&(d1<d2)))
    {
      de=true;
    }
    
    
    return de;
  }
}