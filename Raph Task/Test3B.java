public class Test3B{
  public int sum;
  public int y;
  public void methodA(){    
    int x=0, y =0, i=0;
    int [] msg = new int[1];
    while (i < 5) {
      msg[0] = i + 2;    
      y = y + msg[0]; 
      methodB(msg, msg[0]);
      x = y + msg[0] + i;
      sum = x + y + msg[0];
      System.out.println(x + " " + y+ " " + sum);
      i++;
    }
  }
  private void methodB(int [] mg2, int mg1){
    int x = 0;
    y = y + mg2[0];
    x = x + 4+ mg1;
    sum = sum + x + y;
    mg2[0] = y + mg1;
    mg1 = mg1 + x + 1;
    System.out.println(x + " " + y+ " " + sum);  
  }
}
