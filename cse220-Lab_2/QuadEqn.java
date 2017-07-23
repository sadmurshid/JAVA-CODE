import java.util.Scanner;
public class QuadEqn{
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    
    System.out.println();
    int a=sc.nextInt();
    System.out.println();
    int b=sc.nextInt(); 
    System.out.println();
    int c=sc.nextInt();
    
    System.out.println(a+"2"+"+" +(b)+"x" +"+"+ c);
    calculate(a,b,c);
    
  }
  public static double calculate(int x, int y, int z){
    double d=(-y+Math.sqrt((y*y)-4*x*z))/2;
    System.out.println(d);
    return d;
  }
}
