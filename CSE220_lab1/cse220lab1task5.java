import java.util.Scanner;
class cse220lab1task5
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    int [] numArr=new int[15];
    for(int i=0; i<15; i++)
    {
      System.out.println("Please enter the "+(i+1)+" th elament of the array");
      numArr[i]=er.nextInt();
    }
    int [] couArr=new int[10];
    
    for(int i=0; i<15; i++)
    {
      couArr[numArr[i]]++;
    }
    
    for(int i=0; i<10; i++)
    {
      System.out.println(i+" was found "+couArr[i]+" times");
    }
    
  }
}
    
    
    