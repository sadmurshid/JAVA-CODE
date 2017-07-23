import java.util.Scanner;
class anna2013Fall
{
  public static void main(String args [])
  {
    Scanner er =new Scanner(System.in);
    System.out.println("Please enter the starting point.");
    int st=er.nextInt();
    System.out.println("Please enter the ending point.");
    int en=er.nextInt();
    System.out.println("Please enter the difference.");
    int di=er.nextInt();
    
    for (int i=st; i<=en; i=i+di)
    {
      System.out.print(i +",");
    }
    System.out.println("");
  }
}