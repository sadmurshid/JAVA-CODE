import java.util.Scanner;
class cse220lab1task1
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
    boolean de=false;
    if(numArr[0]==6||numArr[l-1]==6)
    {
      de=true;
    }
    System.out.println(de);
  }
}