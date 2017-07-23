import java.util.Scanner;
class anna2009Summer
{
  public static void main(String args [])
  {
    Scanner er=new Scanner(System.in);
    int []x=new int[10];
    int c=0;
    int s=0;
    for(int i=0; i<10; i++)
    {
      System.out.println("Please enter a number.");
      x[i]=er.nextInt();
      if(x[i]%11!=0)
      {
        s=s+x[i];
        c++;
      }
    }
    
    double av=s/c;
    System.out.println("Avarage : "+av);
  }
}