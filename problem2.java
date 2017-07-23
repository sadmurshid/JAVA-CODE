import java.util.Scanner;
class problem2
{
  public static void main(String [] args)
  {
    Scanner er=new Scanner(System.in);
    
    int t = er.nextInt();
    double total,back,cValue, cash;
    int quantity,n;
    
    for(int i=0; i<t; i++)
    {
      total=back=cValue=cash=0;
      quantity=0;
      n=er.nextInt();
      for(int j=0; j<n; j++)
      {
        cValue=er.nextDouble();
        quantity=er.nextInt();
        total=total+(cValue*quantity);
        //System.out.println(total);
      }
      cash=er.nextDouble();
      back=cash-total;
      int g=(int)back;
      System.out.println("Case "+(i+1)+": "+g);
    }
    
  }
}