public class Q44
 {  
   public static void main(String args[])
{
int x = 0, y =0;
intsum = 0;
double p;
     while (x < 10){
       y = x / 2;
       while (y < x){
         p = (x + 10.0) / 2;
         sum = (sum % 2) + x - y * 2 + (int) p ;
System.out.println(sum);
         y = y + 2;
}
       if (x > 5){
         x++;
       }else{
         x += 2;
       }
     }
   }
 }

