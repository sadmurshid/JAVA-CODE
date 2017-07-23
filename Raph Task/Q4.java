
public class Q4
{  
  public static void main(String args[])
  {
    int x = 0, y =0;
    int sum = 0;
    boolean a = false, b = true, c = false, d = false, e = true; 
    while (x < 15){
      y = x - 3;
      y = 20;
      while (y > 14){
        if ((sum > 30) && (sum < 40)) 
          sum = sum + x * 2 ;
        else if ((sum > 30) && (sum < 60)) 
          sum = sum + x * 3; 
        else 
          sum = sum + 33;
        if((a&&b)||(c||d)||e)
        {
          a=((a && b) || (b && c)) && false;
          b = (a || b) || ((c && d) && false);
          c = (a || c) && ((8 * 10 > 45) && e);
          d=(c && d) && ((e && false) || true);
          e = !(!(a && b) && !(c || d));
          
          System.out.println(sum);
        }
        else
        {
          c = (a ||e) ;
          d=(c && d) && ((e && false) || true);
          e = !e;
          System.out.println(sum*2);
        }
        
        y = y - 3;
      }
      x += 3;
    }
  }
}
