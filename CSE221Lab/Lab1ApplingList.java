import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Lab1ApplingList
{
  public static void main(String[]args) throws IOException
  {
    node n=new node(null,null);
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the path of txt file");
    FileReader fr=new FileReader(er.next());
    BufferedReader br=new BufferedReader(fr);
    String s=br.readLine();
    int size=Integer.parseInt(s);                                //List size=# of nodes
    n.next=n;
    n.prev=n;
    node head=n;
    for(int i=1; i<=size; i++)
    {
      node n1=new node(null,null);
      n1.next=n.next;
      n1.prev=n;
      n.next=n1;
    }
//    System.out.println("Stage 1 compete");
    int node=Integer.parseInt(br.readLine());                    //# of Edges=node
    String str=null;
    for(int i=1; i<=node; i++)
    {
      node ni=n;
      s=br.readLine();
      String [] st=s.split(" ");
      int fn=Integer.parseInt(st[0]);
      int sn=Integer.parseInt(st[1]);
      for(int j=1; j<=fn; j++)
      {
        ni=ni.next;
      }
      node push=new node(null,null, sn);
      push.next=ni.subNext;
      push.prev=ni.subPrev;
      if(ni.subNext==null)
      {        
        ni.subNext=push;
        ni.subPrev=push;
        push.prev=ni;
        push.next=ni;
      }
      else
      {
        ni.subNext.prev=push;
        ni.subNext=push;
      }
      ni=n;
      for(int j=1; j<=sn; j++)                         //2nd face
      {
        ni=ni.next;
      }
      push=new node(null,null, fn);
      
      push.next=ni.subNext;
      push.prev=ni.subPrev;
      if(ni.subNext==null)
      {        
        ni.subNext=push;
        ni.subPrev=push;
        push.prev=ni;
        push.next=ni;
      }
      else
      {
        ni.subNext.prev=push;
        ni.subNext=push;
      }
    }
//    System.out.println("Stage 2 ok");
    node nn=head;
    for(int i=1; i<=size+1; i++)
    {
      if(i!=1)
      {
        System.out.print(i-1+" => ");
      }
      if(nn.subNext!=null)
      {
        node nnn=nn.subNext;
        while(nnn.next!=nn)
        {
          System.out.print(nnn.friend+" ");
          nnn=nnn.next;
        }
        System.out.print(nnn.friend+" ");
      }
      System.out.println();
      nn=nn.next;
    }
  }
}