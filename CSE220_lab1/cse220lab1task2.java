
import java.util.Scanner;
class cse220lab1task2
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the length of array");
    int l=er.nextInt();
    int [] numArr=new int[l];
    
    for(int i=0; i<l; i++)
    {
      System.out.println("Please enter the "+(i+1)+" th elament of the array");
      numArr[i]=er.nextInt();
    }
    
    int bNum=numArr[0], bPos=0, sNum=numArr[0], sPos=0;
    
    for(int i=1; i<l; i++)
    {
      if(bNum<numArr[i])
      {
        bNum=numArr[i]; bPos=i;
      }
      if(sNum>numArr[i])
      {
        sNum=numArr[i]; sPos=i;
      }
    }
    
    numArr[bPos]=sNum;
    numArr[sPos]=bNum;
    
    for(int i=0; i<l; i++)
    {
      System.out.println(numArr[i]);
    }
  }
}