import java.util.Scanner;
import java.util.Queue;
import java.io.IOException;
import java.util.*;
class BFS
{
  static int []color;
  static int []parent;
  static int []level;
  public static void main(String[]args) throws IOException
  {
    Scanner er=new Scanner(System.in);
    Queue<Integer> q = new LinkedList<Integer>();
    Lab1ApplingMatrix graph=new Lab1ApplingMatrix();
    String[] t={"klj", "oiho"};
    graph.main(t);                          //Deriving the lab1ApplingMatrix class
    int[][]mat=graph.mat;
    int size=mat.length;
    color=new int[size];                    //Initializing color, parent and level color 1=white, 2=gray, 3=black
    parent=new int[size];
    level=new int[size];
    
    System.out.println("Please enter the source");
    int source=er.nextInt()-1;
    
    for(int i=0; i<size; i++)
    {
      level[i]=Integer.MAX_VALUE;
      color[i]=1;
    }
    level[source]=0;
    color[source]=2;
    parent[source]=0;
    q.add(source);
    
    while(q.isEmpty()==false)
    {
      int u=q.poll();
      for(int i=0; i<size; i++)
      {
//        System.out.println(" i "+i);
        if(mat[u][i]==1)
        {
          if(color[i]!=2&&color[i]!=3)
          {
            color[i]=2;
            parent[i]=u;
            level[i]=level[u]+1;
            q.add(i);
          }
        }
        
      }
      color[u]=3;
    }
    
    for(int i=0; i<size; i++)
    {
      System.out.println("Node "+(i+1)+" Parent  "+(parent[i]+1)+" Level "+level[i]);
    }
  }
}