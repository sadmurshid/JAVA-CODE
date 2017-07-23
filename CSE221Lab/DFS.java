import java.util.Scanner;
import java.io.IOException;
class DFS
{
  static int[][]mat;
  static int[] color;
  static int[] parent;
  static int[] st;
  static int[] ft;
  static int time;
  public static void main(String[]args)throws IOException
  {
    Scanner er=new Scanner(System.in);
    Lab1ApplingMatrixDirected graph=new Lab1ApplingMatrixDirected();
    String[] t={"klj", "oiho"};
    graph.main(t);                          //Deriving the lab1ApplingMatrix class
    mat=graph.mat;
    
    dfs();
    print();
    
  }
  
  static void print()
  {
    for(int i=0; i<mat.length; i++)
    {
      System.out.println("Node "+(i+1)+" Discovary time "+st[i]+" Finishing time "+ft[i]);
    }
  }
  
  static void dfs()
  {
    int size=mat.length;
    
    color=new int[size];
    parent=new int[size];
    st=new int[size];
    ft=new int[size];
    
    for(int i=0; i<size; i++)
    {
//      System.out.println(" i "+i);
      color[i]=1;                            //color 1=white, 2=gray and 3=balck
      parent[i]=Integer.MAX_VALUE;
      st[i]=Integer.MAX_VALUE;
      ft[i]=Integer.MAX_VALUE;
    }
    time=0;
    for(int i=0; i<size; i++)
    {
      if(color[i]==1)
      {
//        System.out.println(" i "+i);
        dfsVisit(i);
      }
    }
  }
  
  static void dfsVisit(int u)
  {
    time=time+1;
    st[u]=time;
    color[u]=2;
    for(int i=0; i<mat.length; i++)
    {
      if(mat[u][i]==1)
      {
        if(color[i]==1)
        {
          parent[i]=u;
          dfsVisit(i);
        } 
      }
    }
    color[u]=3;
    time=time+1;
    ft[u]=time;
  }
  
}