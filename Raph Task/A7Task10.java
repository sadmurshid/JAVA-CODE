import java.util.Scanner;
public class A7Task10{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int[]x= new int[5]; 
    for(int a=0; a<x.length; a++){
      for(int b=a+1; b<x.length; b++){    
        if(x[a]>x[b]){
          int temp= x[b];
          x[b]=x[a];
          x[a]=temp;
        }
      }
    }
    for(int i=0; i<x.length; i++){
      
    System.out.println("Please Enter Number");
      System.out.println("Array Position "+i+" value :"+x[i]);
    }
    
  }
}