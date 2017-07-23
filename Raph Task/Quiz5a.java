public class Quiz5a
{  
  public static void main(String args[])
  {
    int [] myArray = new int[10];
    int [] b;
    int index1 = 0, index2 =0;
    index1 = 1;
    b =  myArray;
    while (index1 < 10){
    myArray[index1] += myArray[index2%10]+ 2;
    System.out.print("   MA W1  "+myArray[index1]);
    index2 = 1;
    System.out.print("  in2  "+index2);
      while (index2 < index1 ){
        myArray[index1] = b[index2%7]  - index1;
        System.out.print("  MA W2 "+myArray[index1]);
        index2 = (index2++) + 1;
        System.out.print("   in2  "+index2);
    }
    System.out.println(myArray[index1]);
    index1 = (++index1) + 1;
    System.out.print("  in1   "+index1);
    }
  }
}
