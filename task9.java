import java.util.Scanner;

public class task9
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many numbers you want to give?");
    int n = sc.nextInt();
    int [] x = new int[n];
 
    for(int i = 0; i <x.length; i++)
    {
      System.out.println("Enter a number");
       x[i]= sc.nextInt();
    }
     int L=x.length-1;
     int i = 0; 
    while (i<=L)
    {
      if (x[L]==x[i])
      {
       L--;
       i++;
      }
   else
    {
       System.out.println("Not Palindrome");
       break;
    }
    System.out.println("It's Palindrome");
    break;
  }
}
}