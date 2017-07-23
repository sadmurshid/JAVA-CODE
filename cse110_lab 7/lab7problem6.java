import java.util.Scanner;
public class lab7problem6
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    int x,y,z;
    System.out.println("Please enter a number.");
    x = er.nextInt();
    y=1;
    while(y<=x)
    {
      z=1;
      while(z<=y)
      {
        System.out.print(z);
        z++;
      }
      System.out.println();
      y++;
    }
  }
}