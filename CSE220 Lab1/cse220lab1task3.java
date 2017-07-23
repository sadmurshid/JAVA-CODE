import java.util.Scanner;
class cse220lab1task3
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    int [] numArr=new int[5];
    for(int i=0; i<5; i++)
    {
      System.out.println("Please enter the "+(i+1)+" th elament of the array");
      numArr[i]=er.nextInt();
    }
    
    int temp;
    for(int i=0; i<5; i++)
    {
      for(int j=i+1; j<5; j++)
      {
        if(numArr[i]<numArr[j])
        {
          temp=numArr[i];
          numArr[i]=numArr[j];
          numArr[j]=temp;
        }
      }
    }
    
    for(int i=0; i<5; i++)
    {
      System.out.println(numArr[i]);
    }
    for(int i=0; i<5; i++)
    {
      if(numArr[i]%2==0)
      {
        System.out.println(numArr[i]);
      }
    }
  }
}