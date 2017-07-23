import java.io.IOException;
class kruskal
{
  static Lab1ApplingMatrixWeighted graph;
  public static void main(String []args) throws IOException
  {
    graph=new Lab1ApplingMatrixWeighted();
    String[] t={"klj", "oiho"};
    graph.main(t);                                               //Deriving the lab1ApplingMatrixWeight class
    int[][]mat=graph.mat;                                        //Initialize the matrix of graph
    int size=mat.length;                                         //Length of the matrix
    int [][]mat1=new int[size][size];                            //Empty matrix for graph
    int edge=graph.node;                                         //Total edge #
    int [][] unSorted=new int [edge][3];                         // All edge will kept as (weight, FN, SN)
    int [] fine=new int[size];                                   // Array for fine set
    for(int i=0; i<size; i++)                                    //Initiate all fine set w.r.t it's own number
      fine[i]=i;
    
    int counter=0;
    for(int i=0; i<size; i++)                                    //Taking all the the edges to the unSorted array
    {                                                            // It keep the data as(weight, FN, Sn)
      for(int j=0; j<size; j++)
      {
        if((mat[i][j]>0)&&(j>=i))
        {
          unSorted[counter][0]=mat[i][j];
          unSorted[counter][1]=i;
          unSorted[counter][2]=j;
          counter++;
        }
      }
    }
    int temp;
    int temp1;
    int temp2;
    for(int i=0; i<edge; i++)                                    //Sorting the edges by bubble sorting
    {
      for(int j=0; j<edge; j++)
      {
        if(unSorted[i][0]<unSorted[j][0])
        {
          temp=unSorted[i][0];
          temp1=unSorted[i][1];
          temp2=unSorted[i][2];
          unSorted[i][0]=unSorted[j][0];
          unSorted[i][1]=unSorted[j][1];
          unSorted[i][2]=unSorted[j][2];
          unSorted[j][0]=temp;
          unSorted[j][1]=temp1;
          unSorted[j][2]=temp2;
        }
      }
    }    
    int fn;
    int sn;
    for(int i=0; i<edge; i++)                                    //Take the edges with different fine set
    {
      fn=unSorted[i][1];
      sn=unSorted[i][2];
      if(fine[fn]!=fine[sn])                                     //if the fine set of FN and SN don't match then do
      {
        mat1[fn][sn]=unSorted[i][0];
        mat1[sn][fn]=unSorted[i][0];
        int min;
        int max;
        if(fine[fn]<fine[sn])                                    //Taking the minimum fine set value
        {
          min=fine[fn];
          max=fine[sn];
        }
        else
        {
          min=fine[sn];
          max=fine[fn];
        }
        for(int j=0; j<fine.length; j++)                         //Setting the minmum fine set value to all fine set
        {                                                        //  which belong the max fine set value.
          if(fine[j]==max)
            fine[j]=min;
        }
      }
    }
    System.out.println();
    for(int i=0; i<size; i++)                                    //print the Minimum Spanning tree
    {
      System.out.print((i+1)+" => ");                            //Print the node
      for(int j=0; j<size; j++)
      {
        if(mat1[i][j]>0)
          System.out.print((j+1)+" "+"Weight "+mat1[i][j]+"  ");  //Print if two node have an edge
      }
      System.out.println();
    }
  }
}


//Help taken from Aakash Hasija (Geeks for geeks website)
