import java.util.Scanner;
class cse220lab1task4
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    int [] numArr=new int[10];
    for(int i=0; i<10; i++)
    {
      System.out.println("Please enter the "+(i+1)+" th elament of the array");
      int x=er.nextInt();
      boolean b=false;
      for(int j=0; j<i; j++)
      {
        //System.out.println(b);
        if(numArr[j]==x)
        {
          b=true;
          //System.out.println(b);
          break;
        }
      }
      if(b==false)
      {
        numArr[i]=x;
      }
      else
      {
        System.out.println("You did enter the number before.");
        i--;
      }
    }
    
    for(int i=0; i<10; i++)
    {
      System.out.println(numArr[i]);
      
    }
    
  }
}
