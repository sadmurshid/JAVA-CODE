import java.util.Scanner;
public class Lab01Task04
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int NumberArray [] = new int [5];
    System.out.println("Enter the 1 element of the array");
    int FirstInput =sc.nextInt();
    NumberArray[0]=FirstInput;
    for(int counter=1;counter<NumberArray.length;counter++)
    {
      System.out.println("Try an input");
      int CheckNumber=sc.nextInt();
      System.out.println("CheckNumber "+CheckNumber );
      System.out.println("Test 0  "+NumberArray[0]);
      System.out.println("Test 1  "+NumberArray[1]);
      
      for(int counter1=0;counter1<NumberArray.length;counter1++){
        System.out.println("Test    "+NumberArray[counter]+" counter "+counter);
        if(NumberArray[counter1]==CheckNumber){
          System.out.println("Test    "+NumberArray[counter]+" counter "+counter);
          System.out.println("Duplicate");
          counter--;
        }
        else{
          NumberArray[counter]= CheckNumber;
          break;
        }
      }
    }
    for(int i=0;i<NumberArray.length;i++){
      System.out.println(NumberArray[i]+" ");
    }
  }
}