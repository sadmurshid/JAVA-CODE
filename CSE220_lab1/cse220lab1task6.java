import java.util.Scanner;
class cse220lab1task6
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the size of the Array.");
    int l=er.nextInt();
    int [] numArr=new int[l];
    
    for(int i=0; i<l; i++)
    {
      System.out.println("Please enter the "+(i+1)+" th elament of the array");
      numArr[i]=er.nextInt();
    }
    
    boolean b=false;
    
    
    if(l%2==0)
    {
      for(int i=0; i<l/2; i++)
      {
        if(numArr[i]==numArr[l-i-1])
        {
          b=true;
        }
        else
        {
          b=false;
          break;
        }
      }
    }
    else
    {
      for(int i=0; i<l/2; i++)
      {
        if(numArr[i]==numArr[l-i-1])
        {
          b=true;
        }
        else
        {
          b=false;
          break;
        }
      }
    }
    if(b==true)
    {
      System.out.println("Palindrom");
    }
    else
    {
      System.out.println("not Palindrom");
    }
  }
}