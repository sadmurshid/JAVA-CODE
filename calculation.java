class calculation
{
  public double result;
  public double x;
  public double y;
  
  void setX(double a)
  {
    x=a;
    result=a;
  }
  void addition(double a)
  {
    result=result+a;
    System.out.println(result);
  }
  void subtraction(double a)
  {
    result=result-a;
  }
  void multiplication(double a)
  {
    result=result*a;
  }
  void division(double a)
  {
    result=result/a;
  }
  double show()
  {
    System.out.println("Result : "+result);
    return result;
  }
  
}