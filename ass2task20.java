import java.util.Scanner;
class ass2task20
{
  public static void main(String args[])
  {
    Scanner er=new Scanner(System.in);
    int [] x=new int[10];
    
    for (int i=0; i<10; i++)
    {
      System.out.println("Please enter a number within 0 to 10.");
      x[i]=er.nextInt();
    }
    System.out.println("Please enter the position of array you want.");
    int y=er.nextInt();
    int z= x[y];
    
    for (int i=0; i<z; i++)
    {
      System.out.print("*");
    }
    
  }
}