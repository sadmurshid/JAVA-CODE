class ComplexNumber extends RealNumber
{
  double Imaginary=0.0;
  ComplexNumber()
  {
    setRealValue(1.0);
    Imaginary=1.0;
  }
  ComplexNumber(int x, int y)
  {
    setRealValue(x);
    Imaginary=y;
  }
  void check()
  {
    System.out.println("I'm in ComplexNumber class"+"\n"+"I'm in RealNumber class"+"\n"+"Checking ended." );
  }
  public String toString()
  {
    System.out.println(super.toString());
    return "Imaginarypart: "+Imaginary;
  }
}