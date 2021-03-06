/*****************************************************************
  *      Programmer : Sa'd Murshid Khan Adon                     * 
  *             BRAC University                                  *
  *      ID         : 14301101                                   *
  *      Problem    :                                            *
  *                                                              *
  *                                                              *
  ****************************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class creatingMatrixGraphForAStarAlgorithm
{
  static double [][] mat;
  static int [] heuristic;
  static String [] name;
  static int node;
  
  
  
  public static void main(String[]args) throws IOException
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the path of txt file");
    FileReader fr=new FileReader(er.next());
    BufferedReader br=new BufferedReader(fr);
    String s=br.readLine();
//    System.out.println(s);
    String str=null;
    str=br.readLine();
    String [] st;
    st=str.split(" ");
    int fn, sn;
    fn=Integer.parseInt(st[0]);
    sn=Integer.parseInt(st[1]);
    
    int size;                                                    //array size=# of nodes
    
    
//    node=Integer.parseInt(br.readLine());                        //# of Edges=node
    
    
    if(fn<sn)
    {
      size=fn;
      node=sn;
    }
    else if(sn<fn)
    {
      size=sn;
      node=fn;
    }
    else
    {
      size=fn;
      node=fn;
    }
    
    mat=new double[size][size];
    name=new String[size];
    name[0]=br.readLine();
    name[size-1]=br.readLine();
    
    double dis;
    
    for(int i=0; i<node; i++)
    {
      str=br.readLine();
      st=str.split(" ");
      fn=Integer.parseInt(st[0]);                            //Change into integer value
      sn=Integer.parseInt(st[1]);                            //Change into integer value
      dis=Integer.parseInt(st[2]);
//      System.out.println(st[0]+" "+st[1]);
      mat[fn-1][sn-1]=tn;                                        //Making edge between nodes
      mat[sn-1][fn-1]=tn;                                        //Making edge between nodes
    }
//    System.out.println(node);
    for(int i=0; i<size; i++)
    {
      System.out.print((i+1)+" => ");                            //Print the node
      for(int j=0; j<size; j++)
      {
//        System.out.println(i+1+" "+(j+1));
        if(mat[i][j]>0)
          System.out.print((j+1)+" "+"Weight "+mat[i][j]+"  ");  //Print if two node have an edge
      }
      System.out.println();
    }
  }
}