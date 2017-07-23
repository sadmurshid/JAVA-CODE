import java.util.Scanner;
class anna1
{
  public static void main(String args [])
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Plese enter how many number will you enter. ");
    int size=er.nextInt();
    int []x=new int [size];
    for (int i=0; i<x.length; i++)
    {
      System.out.println("Plese enter a number");
      x[i]=er.nextInt();
    }
    int max=x[0],max1=0,loc=0,loc1=0;
    for (int i=1; i<x.length; i++)
    {
      if(max<x[i])
      {
        max=x[i];
        loc=i;
      }
      else if(max1<x[i])
      {
        max1=x[i];
        loc1=i;
      }
    }
    System.out.println("Largest Number : "+max+" Location : "+(loc+1));
    System.out.println("2nd Largest Number : "+max1+" Location : "+(loc1+1));
  }
}