import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class lab2ApplingQuickSort
{
  static int [] arr;
  public static void main(String[]args)throws IOException
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the path of txt file");
    FileReader fr=new FileReader(er.next());
    BufferedReader br=new BufferedReader(fr);
    int size=Integer.parseInt(br.readLine());
    arr=new int[size];
    String [] str=(br.readLine()).split(" ");
    for(int i=0; i<size; i++)
    {
      arr[i]=Integer.parseInt(str[i]);
    }
    quickSort(0,arr.length-1);
    
    for(int i=0; i<size; i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
  static void quickSort(int p, int r)
  {
    if(p<r)
    {
      int q=partition(p,r);
      quickSort(p,q-1);
      quickSort(q+1,r);
    }
  }
  static int partition(int p, int q)
  {
    int x=arr[p];
    int i=p;
    for(int j=p+1; j<=q; j++)
    {
      if(arr[j]<x)
      {
        int temp=arr[i+1];
        int temp1=arr[j];
        arr[i]=temp1;
        arr[j]=temp;
        arr[i+1]=x;
        i++;
      }
    }
    return i;
  }
}