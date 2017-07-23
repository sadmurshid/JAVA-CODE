import java.util.*;
import java.io.IOException;
class dijkstra
{
  static boolean [] Discover;                                    //Detarmine whether it is discover or not 
  static int [] weight;                                          //Distence from the Source
  static Lab1ApplingMatrixWeighted graph;
  static int[][]mat;                                             //Matrix representation of the graph
  static int [] parent;                                          //Parent node
  static int size;                                               //Number of vertex
  
  public static void main(String[] args) throws IOException
  {
    Scanner er=new Scanner(System.in);
    graph=new Lab1ApplingMatrixWeighted();
    String[] t={"klj", "oiho"};
    graph.main(t);                                               //Deriving the lab1ApplingMatrixWeight class
    mat=graph.mat;
    size=mat.length;
    Discover=new boolean[size];
    weight=new int[size];
    parent=new int[size];
    for(int i=0; i<size; i++)                                    //Make all parent -1, weight infinity, discover false
    {
      Discover[i]=false;
      weight[i]=Integer.MAX_VALUE;
      parent[i]=-1;
    }
    System.out.println("Please enter the Source node and remember that I don't have a brain. Don't test me.");
    int source=er.nextInt();
    parent[source]=0;
    weight[source]=0;
    for(int i=0; i<size-1; i++)
    {
      int u=minDistence();
      Discover[u]=true;
      for(int v=0; v<size; v++)
      {
        if(Discover[v]!=true&&mat[u][v]!=0&&weight[u]!=Integer.MAX_VALUE&&(weight[u]+mat[u][v]<weight[v]))
        {
          weight[v]=weight[u]+mat[u][v];
          parent[v]=u;
        }
      }
    }
    
    for(int i=0; i<size; i++)
    {
      System.out.println("Parent of "+(i+1)+" is "+(parent[i]+1)+" and distence from "+ source +" = "+weight[i]);
    }
    
  }
  
  static int minDistence()
  {
    int min=Integer.MAX_VALUE;
    int minimumIndex=-1;
    for(int i=0; i<size; i++)
    {
      if(Discover[i]==false && weight[i]<=min)
      {
        min=weight[i];
        minimumIndex=i;
      }
    }
    return minimumIndex;
  }
}