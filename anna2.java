import java.util.Scanner;
class anna2
{
  public static void main(String args[])
  {
    Scanner er=new Scanner(System.in);
    
    System.out.println("Plese enter 24 hours times.");
    int x= er.nextInt();
    
    if (x==0)
    {
      System.out.println("12 Night");
    }
    else if (x>0 && x<12)
    {
      System.out.println(x+" AM ");
    }
    else if (x==12)
    {
      System.out.println("12 Noon");
    }
    else if (x>12 && x<24)
    {
      System.out.println((x-12)+" PM ");
    }
    else
    {
      System.out.println("You have entered an invalid time");
    }
  }
}