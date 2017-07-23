import java.util.Scanner;
class ass11task11
{
  public static void main(String args [])
  {
    Scanner er=new Scanner(System.in);
    task11 a= new task11();
    
    System.out.println("Plese enter a number.");
    long x= er.nextLong();
    
    System.out.println(a.allOdds(x));
    
    
  }
}