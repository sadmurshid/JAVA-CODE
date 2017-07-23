import java.util.Scanner;
class lab2ApplingHeapSort
{
  private static int[] arr;
  private static int n;
//  private static int l;
//  private static int r;
//  private static int largest;
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    int []array=new int[er.nextInt()];
    for(int i=0; i<array.length; i++)
    {
      array[i]=er.nextInt();
    }
    
    
    buildMaxHeap(array);
//    maxHeapify(arr, 0);
    
    for(int i=n;i>0;i--)
    {
      swap(0, i);
      n--;
//      buildMaxHeap(arr);
      maxHeapify(arr, 0);
    }
    
    for(int i=0; i<arr.length; i++)
    {
      System.out.print(arr[i]+"  ");
    }
  }
  public static void buildMaxHeap(int []array){
    arr=array;
    n=arr.length-1;
    for(int i=n/2;i>=0;i--)
    {
      maxHeapify(arr,i);
    }
  }
  static void swap(int i, int j)
  {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
  static void maxHeapify(int [] arr, int i)
  {
    int l=2*i;
    int r=2*i+1;
    int largest=i;
    if(l<=n&&arr[l]>arr[i])
    {
      largest=l;
    }
    else
    {
      largest=i;
    }
    if(r<=n&&arr[r]>arr[largest])
    {
      largest=r;
    }
    
    if(largest!=i)
    {
      swap(i,largest);
      maxHeapify(arr,largest);
    }
  }
}