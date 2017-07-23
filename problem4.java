import java.util.Scanner;
class problem4
{
  public static void main(String [] args)
  {
    Scanner er=new Scanner(System.in);
    
    int t = er.nextInt();
    int r,c, counter;
    char [][]mat;
    String f;
    
    for(int i=0; i<t; i++)
    {
      counter=0;
      r=er.nextInt();
      c=er.nextInt();
      er.nextLine();
      
      mat=new char[r][c];
      for(int j=0; j<r; j++)
      {
        
        f=er.nextLine();
        
        for(int k=0; k<c; k++)
        {
          mat[j][k]=f.charAt(k);
//          System.out.println(mat[j][k]);
        }
      }
      
      System.out.println("Case "+(i+1)+": ");
      
      for(int j=0; j<r; j++)
      {
        
        for(int k=0; k<c; k++)
        {
          if(mat[j][k]=='$')
          {
             System.out.println((j+1)+","+(k+1));
             counter++;
          }
        }
      }
      if(counter==0)
      {
        System.out.println("No Gold Found");
      }
      
      
      
      
      //System.out.println("Case "+(i+1)+": "+pera);
    }
    
  }
}