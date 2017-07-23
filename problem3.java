import java.util.Scanner;
class problem3
{
  public static void main(String [] args)
  {
    Scanner er=new Scanner(System.in);
    
    int t = er.nextInt();
    int x,y,pera;
    for(int i=0; i<t; i++)
    {
      pera=0;
      x=er.nextInt();
      y=er.nextInt();
      pera=(x*2)+(y*3);
      
      System.out.println("Case "+(i+1)+": "+pera);
    }
    
  }
}