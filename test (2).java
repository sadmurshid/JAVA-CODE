public class test{


 public static Book [] removeOdd (Book [] input){
   int newArrLen =0;
   for(int counter=0;counter<input.length;counter++){
    if(input[counter].geID()%2==0){
     newArrLen++;
     }
   }
   System.out.println(newArrLen);
   Book arr[]= new Book[newArrLen];
   int counter1=0;
   for(int counter2=0;counter2<input.length;counter2++){
    if(input[counter2].geID()%2==0){
     arr[counter1]=input[counter2];
     counter1++;
    }
 }
  return arr;
 }
 
 public static void main(String [] args){
Book book1 = new Book();
Book book2 = new Book();
Book book3 = new Book();
book1.setName("Java the complite refrence");
book1.setID(1234);
book2.setName("Java for dummeys");
book2.setID(1235);
book3.setName("Teach yourself Java");
book3.setID(1236);

Book [] mixedArray = {book1, book2, book3};
   for (int i = 0; i < mixedArray.length; i++) {
     System.out.println(mixedArray[i] + " ");
   }
   System.out.println();
   Book [] noOdd = removeOdd(mixedArray);
   for (int i = 0; i < noOdd.length; i++) {
     System.out.println(noOdd[i] + " ");
   }    
 }
}