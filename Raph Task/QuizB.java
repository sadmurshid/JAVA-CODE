public class QuizB{
  public int sum;
  public int y;
  public void methodA(){    
    int x=0, y =0;
    y = y + this.y; 
    x = this.y + 2;
    sum = x + y + methodB(x, y);
    System.out.println(x + " " + y+ " " + sum);
  }
  public int methodB(int m, int n){
    int x = 0;
    y = y + m;
    x = x + 2 + n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
    return sum;
  }
}
