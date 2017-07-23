import java.util.Scanner;
public class t2
{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    int x, c=1, su=0;
    double avg;
    while(c<=20)
    {
      System.out.println("Please enter a number .");
      x = s.nextInt();
      su = su+x;
      c=c+1;
    }
    avg=su/20;
    System.out.println("Avarage is: "+avg);
  }
}