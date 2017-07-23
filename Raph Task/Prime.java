/*******************************************************************************************************************
  * Programmer : Sa'd Murshid Khan Adon 
  * Sec        : 08
  * ID         : 14301101
  * Time       : 01.07.2014 1.00am
  * Sub        : Find 170 prime number and show them. Then give the user a chance to know the specific prime number.
  * **************************************************************************************************************/
import java.util.Scanner;
public class Prime
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int[]y = new int [170];
    int i=0, m=2,x=2,a,b=1,c,d;
    while (i<170)
    {
      x=2;
      while(m%x!=0)
      {
        x++;
      }
      if (m==x)
      {
        System.out.println(m+" is a prime number."+(i+1));
        
        y [i] =m;
        i++;
      }
      m++;
    }
    System.out.println("How many prime number do you want to know ?");
    a= sc.nextInt();
    while (b<=a)
    {
      System.out.println();
      System.out.println("Please enter the position of Prime number you want.");
      c=sc.nextInt();
      if (c<=170 && c>=0)
      {
        i=c-1;
        d=y[i];
        System.out.println(c+" th Prime number is "+d);
        b=b+1;
      }
      else
      {
        System.out.println();
        System.out.println("You have enter an invalid position. Please enter a position within 1 to 170.");
      }
    }
  }
}
