import java.util.Scanner;
class main
{
  public static void main(String[] args)
  {
    try{
    Scanner er=new Scanner(System.in);
    ArrayStack a1=new ArrayStack();
//    ListStack a1=new ListStack();
    System.out.println(a1.size());
    a1.push(52);
    System.out.println(a1.size());
    a1.push(65);
    a1.push(89);
    a1.push(54);
    a1.push(21);
//    a1.push(65);
    System.out.println(a1.size());
    System.out.println(a1.pop());
    System.out.println(a1.pop());
    System.out.println(a1.size());
    System.out.println(a1.peek());
    Object []a=a1.toArray();
    for(int i=0; i<a.length; i++)
    {
      System.out.print(a[i]+" ");
      
    }
    System.out.println();
    System.out.println(a1.search(52));
    System.out.println(a1.toString());
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}