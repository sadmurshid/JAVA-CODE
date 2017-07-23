import java.util.Scanner;
class cse220lab1task9
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
    display(numArr, numArr.length);
    numArr=Squre(numArr, numArr.length);
    display(numArr, numArr.length);
  }
  
  public static int[] Squre(int[]rec, int le)
  {
    for(int i=0; i<le; i++)
    {
      rec[i]=rec[i]*rec[i];
    }
    
    return rec;
  }
  
  public static void display(int[]rec, int le)
  {
    for(int i=0; i<le; i++)
    {
      System.out.println(rec[i]);
    }
  }
  
}
    
    