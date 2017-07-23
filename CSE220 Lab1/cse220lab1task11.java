import java.util.Scanner;
class cse220lab1task11
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    
    System.out.println("Please enter a number");
    int in=er.nextInt();
    System.out.println(allDigitsOdd(in));
    
  }
  
  public static boolean allDigitsOdd(int in)
  {
    boolean bo=false;
    String s=""+in;
    for(int i=0; i<s.length(); i++)
    {
      if(((s.charAt(i)-'0')%2)!=0)
      {
        bo=true;
      }
      else
      {
        bo=false;
        break;
      }
      
    }
    
    return bo;
  }
}