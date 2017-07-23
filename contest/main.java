import java.util.Scanner;
public class main
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    
    int length, j,current;
    //char current;
    int test=er.nextInt();
    String str, add;
    for(int i=0; i<test; i++)
    {
      add="";
      str=er.next();
      length=str.length();
      for(j=0; j<length; j++)
      {
        current=(int)str.charAt(j);
        if(current>64&&current<91)
          add=add+(char)(current+32);
        else if(current>96&&current<123)
          add=add+(char)(current-32);
      }
      System.out.println(add);
    }
    
  }
}