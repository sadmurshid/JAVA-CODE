import java.util.Scanner;
class cse220lab2task8
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    
    System.out.println("Please enter the 1st coefficient 'a'");
    int a=er.nextInt();
    System.out.println("Please enter the 1st coefficient 'b'");
    int b=er.nextInt();
    System.out.println("Please enter the 1st coefficient 'c'");
    int c=er.nextInt();
    
    display(a,b,c);
    
    double e=root(a,b,c);
    
    System.out.println(e);
    
    
    
     }
  public static double root(int a, int b, int c)
  {
    double e=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
    return e;
  }
  
  public static void display(int a,int b, int c)
  {
    if((a<0)&&(b<0)&&(c<0))
    System.out.println(a+"x2"+b+"x"+c);
    else if((a<0)&&(b<0)&&(c>0))
    System.out.println(a+"x2"+b+"x"+"+"+c);
    else if((a<0)&&(b>0)&&(c>0))
    System.out.println(a+"x2"+"+"+b+"x"+"+"+c);
    else if((a<0)&&(b>0)&&(c<0))
    System.out.println(a+"x2"+"+"+b+"x"+c);
    else if((a>1)&&(b<0)&&(c<0))
    System.out.println(a+"x2"+b+"x"+c);
    else if((a==0)&&(b<0)&&(c<0))
    System.out.println("x2"+b+"x"+c);
    else if((a>0)&&(b>0)&&(c<0))
    System.out.println(a+"x2"+"+"+b+"x"+c);
    else if((a>0)&&(b>0)&&(c>0))
    System.out.println(a+"x2"+"+"+b+"x"+"+"+c);
  }
  
}