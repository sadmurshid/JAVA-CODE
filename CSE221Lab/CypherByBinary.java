import java.util.Scanner;


class CypherByBinary
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter anything");
    String str=er.nextLine();
    char[]charArray=str.toCharArray();
    int size=charArray.length;
    String cy="";
    
    for(int i=0; i<charArray.length; i++)
    {
      cy=cy+Integer.toBinaryString(charArray[i]);
      System.out.print(cy);
    }
    String cyr="";
    
    int size6=(size*7)/6+1;
    String re="";
    for(int i=0; i<size6-1; i++)
    {
      String cha=""; 
      for(int j=i*6; j<(i+1)*6; j++)
      {
        cha=cha+cy.charAt(j);
      }
      cha="1"+cha;
      re=re+(char)Integer.parseInt(cha,2);
    }
    System.out.println(re);
    
  }
}