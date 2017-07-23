import java.util.Scanner;
class cse220lab2task9
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the size of the array.");
    int le=er.nextInt();
    int [] arr=new int[le];
    for(int i=0; i<le; i++)
    {
      System.out.println("Please enter the "+i+"th element of the array.");
      arr[i]=er.nextInt();
    }
    System.out.println("Your entered Array is :");
    for(int i=0; i<le; i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println("");
    System.out.println("Please enter the point of the array from which you want to rotate.");
    int in=er.nextInt();
    int [] rL=new int[le];
    int [] rR=new int[le];
    if(in>le-1)
    {
      System.out.println("You have entered wrong position. Try againn ");
    }
    else
    {
      int a=in;
      for(int i=0; i<le; i++)
      {
        if(a==le)
        {
          a=0;
        }
        rL[i]=arr[a];
        a++;
      }
      a=le-in;
       for(int i=0; i<le; i++)
      {
        if(a==le)
        {
          a=0;
        }
        rR[i]=arr[a];
        a++;
      }
    }
    System.out.println("After rotating left the array becomes :");
    for(int i=0; i<le; i++)
    {
      System.out.print(rL[i]+" ");
    }
    System.out.println("");
    System.out.println("After rotating right the array becomes :");
    for(int i=0; i<le; i++)
    {
      System.out.print(rR[i]+" ");
    }
    System.out.println("");
  }
}