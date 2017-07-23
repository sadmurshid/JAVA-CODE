import java.util.Scanner;
public class t5
{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    long x, c=1;
    while(c<=20)
    {
      System.out.println("Please enter a number .");
      x = s.nextLong();
      if(x%2==0)
      {
        System.out.println(x+" is Even");
      }
      else
      {
        System.out.println(x+" is Odd");
      }
      c=c+1;
    }

  }
}