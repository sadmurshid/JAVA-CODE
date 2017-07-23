
import java.util.Scanner;
public class test13{

   
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
   int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
   for (int i = 0; i < mixedArray.length; i++) {
     System.out.print(mixedArray[i] + " ");
   }
   System.out.println();
   int [] noOdd = removeOdd(mixedArray);
   for (int i = 0; i < noOdd.length; i++) {
     System.out.print(noOdd[i] + " ");
   }    
 }
   
    public static int [] removeOdd (int [] input){
   Scanner sc=new Scanner(System.in);
     int c=0;
   for(int j=0;j<input.length;j++){
     if(input[j]%2==0){
       c++;
     }
   }
     int []a=new int[c];
     for(int i=0;i<c;i++){
       a[i]=sc.nextInt();
     }
     return a;
   }
}