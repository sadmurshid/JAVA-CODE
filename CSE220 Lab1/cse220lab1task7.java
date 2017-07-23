import java.util.Scanner;
class cse220lab1task7
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    int [] numArr=new int[10];
    
    for(int i=0; i<10; i++)
    {
      System.out.println("Please enter the "+(i+1)+" th elament of the array");
      numArr[i]=er.nextInt();
    }
    
    
    System.out.println("Please enter a position of the array");
    int in=er.nextInt();
    
    for(int i=0; i<numArr[in]; i++)
    {
      System.out.print("*");
    }
    System.out.println();
    
  }
}