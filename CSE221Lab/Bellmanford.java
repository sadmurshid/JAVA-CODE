/*
 * 
 * 
 *
 *   Last Changed : 15.3.16
 * **********************************************************/

import java.io.IOException;
import java.util.Scanner;
class Bellmanford
{
  static boolean [] Discover;                                    //Detarmine whether it is discover or not 
  static int [] weight;                                          //Distence from the Source
  static int[][]mat;                                             //Matrix representation of the graph
  static int [] parent;                                          //Parent node
  static int size;                                               //Number of vertex
  static int edge;
  static Lab1ApplingMatrixWeightedDirected graph;
  static Scanner er;
  public static void main(String []args) throws IOException
  {
    er=new Scanner(System.in);
    graph=new Lab1ApplingMatrixWeightedDirected();
    String[] t={"klj", "oiho"};
    graph.main(t);                                               //Deriving the lab1ApplingMatrixWeight class
    mat=graph.mat;                                               //Initialize the matrix of graph
    size=mat.length;                                             //Length of the matrix
    int [][]mat1=new int[size][size];                            //Empty matrix for graph
    edge=graph.node;                                             //# of edges
    Discover=new boolean[size];
    weight=new int[size];
    parent=new int[size];
    
    for(int i=0; i<size; i++)                                    //Make all parent -1, weight infinity, discover false
    {
      Discover[i]=false;
      weight[i]=Integer.MAX_VALUE;
      parent[i]=-1;
    }
    if(BellmanFord())
    {
      System.out.println("No negetive cycle");
      
      
     for(int i=0; i<size; i++)
    {
      System.out.println("Parent of "+(i+1)+" is "+(parent[i]+1)+" and distence = "+weight[i]);
    }
      
      
    }
    else
    {
      System.out.println("Negetive cycle found");
    }
    
  }
  
  static boolean BellmanFord()
  {
    System.out.println("Please enter the Source node and remember that I don't have a brain. Don't test me.");
    int source=er.nextInt();
    parent[source]=0;
    weight[source]=0;
    for(int k=0; k<size-1; k++)
    {
      for (int i=0; i<size; i++)
      {
        for(int j=0; j<size; j++)
        {
//          System.out.println("i "+i+"j "+j+"weight "+weight[j]+" mat ij "+mat[i][j]);
          if((weight[j]>weight[i]+mat[i][j])&&(mat[i][j]!=Integer.MAX_VALUE)&&(weight[i]!=Integer.MAX_VALUE))
          {
            weight[j]=weight[i]+mat[i][j];
            parent[j]=i;
//            System.out.println("     done    ");
          }
        }
//        System.out.println();
      }
    }
    
    for (int i=0; i<size; i++)
    {
      for(int j=0; j<size; j++)
      {
        
        if((weight[j]>weight[i]+mat[i][j])&&(mat[i][j]!=Integer.MAX_VALUE)&&(weight[i]!=Integer.MAX_VALUE))
        {
//          System.out.println();
          System.out.println("i ="+i+" j = "+j);
          return false;
        }
      }
    }
    
    return true;
  }
}