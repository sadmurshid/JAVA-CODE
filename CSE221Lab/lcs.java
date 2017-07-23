/********************************************************************************************************************
  *    Programmer        : Sa'dmurshid Khan Adon
  *             BRAC University
  *    ID                : 14301101
  *    Problem           : Knapsack
  *    Input Style       :      
  ******************************************************************************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class lcs
{
  static int mat[][];
  public static void main(String[]args) throws IOException
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the path of txt file");
    FileReader fr=new FileReader(er.next());
    BufferedReader br=new BufferedReader(fr);
    String one=br.readLine();
    String two=br.readLine();
    char[] oneA=one.toCharArray();
    char[] twoA=two.toCharArray();
    
    mat=new int[oneA.length+1][twoA.length+1];
    
    
    
    int max;
    for(int i=0; i<=oneA.length; i++)
    {
      for(int j=0; j<=twoA.length; j++)
      {
        System.out.print(i+","+j+" ");
        if(i==0||j==0)
          mat[i][j]=0;
        else
        {
          if(oneA[i-1]==twoA[j-1])
          {
            mat[i][j]=mat[i-1][j-1]+1;
          }
          else
          {
            int up=mat[i-1][j];
            int left=mat[i][j-1];
            if(up>left)
              mat[i][j]=up;
            else
              mat[i][j]=left;
          }
        }
        System.out.print(mat[i][j]+"  ");
      }
      System.out.println();
    }
    
//    for(int i=0; i<=Titem; i++)
//    {
//      for(int j=0; j<=Tweight; j++)
//        System.out.print(mat[i][j]+" ");
//      System.out.println();
//    }
//    
//    int k=Tweight;
//    
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