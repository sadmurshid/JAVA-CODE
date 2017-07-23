import java.util.Scanner;
class main
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    //ArrayQueue a1=new ArrayQueue();
    ListQueue a1=new ListQueue();
    try
    {
      a1.enqueue(10);
      a1.enqueue(20);
      a1.enqueue(30);
      a1.enqueue(40);
      System.out.println(a1.toString());     //Print
      a1.dequeue();
      a1.dequeue();
      System.out.println(a1.toString());     //Print
      System.out.println(a1.peek());         //Print
      Object[] ob=a1.toArray();
      for(int i=0; i<ob.length; i++)
      {
        System.out.print(ob[i]);             //Print
      }
      System.out.println();
      System.out.println(a1.size());         //Print
      System.out.println(a1.search(20));     //Print
      a1.dequeue();
      a1.dequeue();
      System.out.println(a1.size());         //Print
      a1.enqueue(50);
      a1.enqueue(60);
      System.out.println(a1.toString());     //Print
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}