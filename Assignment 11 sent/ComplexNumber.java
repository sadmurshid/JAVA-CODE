class ComplexNumber
{
  public int real;
  public int imagine;
  public double radious;
  void IncreaseValue(int x, int y)
  {
    real=x+2;
    imagine=y+2;
  }
  double polarRadious()
  {
    radious=Math.sqrt((real*real)+(imagine*imagine));
    return radious;
  }
  public String toString()
  {
    String result= real+" + "+imagine+"i";
    return result;
  }
}