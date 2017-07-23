import java.util.Scanner;
public class Lab0001P9{
  public static void main(String args[]){
    Scanner pc= new Scanner(System.in);
    int n= pc.nextInt();
    for(int a=0; a<n; a++){
      for(int d=0; d<n-a-1; d++){
        System.out.print(" ");
      }
      for(int o=0; o<=a; o++){
        if(a==0||a==n-1||o==0||o==a){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}