import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

class Lab1ApplingArratlist
{
  
  public static void main(String[]args) throws IOException
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the path of txt file");
    FileReader fr=new FileReader(er.next());
    BufferedReader br=new BufferedReader(fr);
//    String s=br.readLine();
    int size=Integer.parseInt(br.readLine());
    ArrayList[] a1=new ArrayList[size];
    int edge=Integer.parseInt(br.readLine());
    
    for(int i=0; i<size; i++)
    {
      a1[i]=new ArrayList();
    }
    String str=null;
    for(int i=0; i<edge; i++)
    {
      str=br.readLine();
      String [] st=str.split(" ");
      int fn=Integer.parseInt(st[0]);                            //Change into integer value
      int sn=Integer.parseInt(st[1]);                            //Change into integer value
//      System.out.println(fn);
//      System.out.println(sn);
      
      a1[fn-1].add(sn);
      a1[sn-1].add(fn);
//      System.out.println(a1[fn]);
    }
    for(int i=0; i<size; i++)
    {
      
      System.out.println(i+1+" => "+a1[i]);

    }
    
  }
}