import java.util.Scanner;
class cse220lab1task8
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    System.out.print("Please enter the size of the row matrix.");
    int le=er.nextInt();
    int [] x=new int[le];
    int [] y=new int[le];
    
    for(int i=0; i<le; i++)
    {
      System.out.println("Please enter the "+(i+1)+" th elament of the array");
      x[i]=er.nextInt();
    }
    for(int i=0; i<le; i++)
    {
      System.out.println("Please enter the "+(i+1)+" th elament of the array");
      y[i]=er.nextInt();
    }
    for(int i=0; i<le; i++)
    {
      int j=5*x[i]-y[i];
      System.out.print(j+" ");
      
    }
    
    System.out.println();
  }
}