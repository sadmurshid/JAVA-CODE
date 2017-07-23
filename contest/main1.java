import java.util.Scanner;
public class main1
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    
    int length, j, strLen, c, numb; long num;
    char cc;
    int test=er.nextInt();
    String str, add, add1, New;
    
    for(int i=0; i<test; i++)
    {
      numb=0;
      add="";
      add1="";
      str=er.next();
      strLen=str.length();
      for(j=0; j<strLen; j++)
      {
        c=(int)str.charAt(j);
        
        if(c>47&&c<58)
        {
          add=add+str.charAt(j);
          //System.out.println(c);999,999,999,919,999,999,999
        }
        else
          break;
      }
      
      for(j=j+1; j<strLen; j++)
      {
        c=(int)str.charAt(j);
        if(c>48&&c<58)
          add1=add1+str.charAt(j);
        else
          break;
      }
      for(j=1; j<10; j++)
      {
        //System.out.println(add);
        //System.out.println(add1);
        New=add+j+add1;
        for(int k=0; k<New.length(); k++)
        {
          numb=numb+((int)New.charAt(k)-48);
        }
        
        //numb=Long.parseLong(New);
        
        if(numb%3==0)
        {
          System.out.println(numb);
          System.out.println(j);
          break;
        }
      }
    }
    
    
  }
}