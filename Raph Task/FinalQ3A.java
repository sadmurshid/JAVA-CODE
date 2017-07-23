public class FinalQ3A
{  
  public static void main(String args[])
  {
    int x = 0, y =0;
    double sum = 0;
    while (x < 10){
      y = x - 3;
      y = 40;
      while (y > 22){
        if ((sum > 1) && (sum < 10)) 
          sum = sum + ( x + 1)  ;
        else if ((sum > 10) && (sum < 20)) 
          sum = sum + (y + 7.0 / 2.0) ; 
        else 
          sum = sum + 3 ;
        System.out.println("17" + sum);
        y = y - 10;
      }
      x += 2;
    }
  }
}
