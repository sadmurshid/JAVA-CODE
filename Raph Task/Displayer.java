import java.util.Scanner;
class asas9task9
{
  public static void main(String[] args)
  {
    Scanner er = new Scanner(System.in);
    int [] x= new int [5];
    int a;
    
    System.out.println("Enter 5 numbers");
    for (int i=0; i<5; i++)
    {
     System.out.println("Plese enter a number .");
     x[i]=er.nextInt();
    } 
    
    System.out.print("Your entered numbers are :");
    for (int i = 0; i<4;i++)
    {
      System.out.print(x[i]+" ,");
    }
    System.out.println(x[4]);
    
    if(x[0]==x[4]&&x[1]==x[3])
    {

      System.out.println("This is a Polydromic Number.");

    }
    else
    {
      System.out.println("This is not a polydromic number.");
    }
    
    
  }
}