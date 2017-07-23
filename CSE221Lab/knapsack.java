/********************************************************************************************************************
  *    Programmer        : Sa'dmurshid Khan Adon
  *             BRAC University
  *    ID                : 14301101
  *    Problem           : Knapsack
  *    Input Style       :      5          (total weight)
  *                             4          (total items)
  *                             2 10       (weight, benifit)
  *                             3 14
  ******************************************************************************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class knapsack
{
  static int mat[][];
  public static void main(String[]args) throws IOException
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the path of txt file");
    FileReader fr=new FileReader(er.next());
    BufferedReader br=new BufferedReader(fr);
    String s=br.readLine();
    int Tweight=Integer.parseInt(s);
    s=br.readLine();
    int Titem=Integer.parseInt(s);
    int [] weight=new int[Titem];
    int [] benifit=new int[Titem];
    String str;
    
    for(int i=0; i<Titem; i++)
    {
      str=br.readLine();
      String [] st=str.split(" ");
      int fn=Integer.parseInt(st[0]);                            //Change into integer value
      int sn=Integer.parseInt(st[1]);                            //Change into integer value
//      System.out.println(st[0]+" "+st[1]);
      weight[i]=fn;
      benifit[i]=sn;
    }
    mat=new int [Titem+1][Tweight+1];
    int max;
    for(int i=0; i<=Titem; i++)
    {
      for(int j=0; j<=Tweight; j++)
      {
        System.out.print(i+","+j+" ");
        if(i==0||j==0)
          mat[i][j]=0;
        else
        {
          int zero=mat[i-1][j];
          int one=0;
          
          if(j>=weight[i-1])
          {
            System.out.print(j-weight[i-1]);
            one=mat[i-1][j-weight[i-1]]+benifit[i-1];
          }
          
          if(zero<one)
            mat[i][j]=one;
          else
            mat[i][j]=zero;
        }
        System.out.print(mat[i][j]+"  ");
      }
      System.out.println();
    }
    
    for(int i=0; i<=Titem; i++)
    {
      for(int j=0; j<=Tweight; j++)
        System.out.print(mat[i][j]+" ");
      System.out.println();
    }
    
    int k=Tweight;
    
    for(int i=Titem; i>=0; i--)
    {
      while(k>=0&&i>0)
      {
        if(mat[i][k]==mat[i-1][k])
        {
          
          break;
        }
        else
        {
          System.out.println(i);
          k=k-weight[i-1];
          i--;
          
        }
        
      }
    }
    
  }
}