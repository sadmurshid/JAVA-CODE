import java.util.Scanner;
class test
{
  public static void main(String [] ar)
  {
    Scanner er=new Scanner(System.in);
    System.out.println("enter the row");
    int r=er.nextInt();
    System.out.println("Enter the column");
    int c=er.nextInt();
    
    int [][]arr=new int [r][c];
    
    for (int i=0; i<r; i++)
    {
      for(int j=0; j<c; j++)
      {
        System.out.println("enter the value of "+i+" "+j);
        arr[i][j]=er.nextInt();
      }
    }
    
    
    for (int i=0; i<r; i++)
    {
      for(int j=0; j<c; j++)
      {
        System.out.print(arr[i][j]+"\t");
        
      }
      System.out.println();
    }
    
    System.out.println(" enter 2 row to swap");
    int a=er.nextInt();
    int b=er.nextInt();
    for (int i=0; i<c;i++)
    {
      int temp;
      temp=arr[a][i];
      arr[a][i]=arr[b][i];
      arr[b][i]=temp;
    }
    
    for (int i=0; i<r; i++)
    {
      for(int j=0; j<c; j++)
      {
        System.out.print(arr[i][j]+"\t");
        
      }
      System.out.println();
    }
  }
}