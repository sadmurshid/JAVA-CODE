public class StringSplit {
  public static void main(String args[]) throws Exception{
   String s1= "['Aaaa', 'Eeee', 'Ffff', 'Cccc', 'Dddd']";

       String[]  array = s1.split(",");
       for(int i=0;i<array.length;i++)
       {
           System.out.println(array[i]);
       }
  }
}