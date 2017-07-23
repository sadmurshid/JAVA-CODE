class ComplexNumber
{
  int real;
  int imaginary;
  
  ComplexNumber()
  {
    real=0;
    imaginary=0;
  }
  ComplexNumber(int r, int i)
  {
    real=r;
    imaginary=i;
  }
  void increaseValue()
  {
    real=real+2;
    imaginary=imaginary+2;
  }
  
  double polarRadius()
  {
    return Math.sqrt(real*real+imaginary*imaginary);
    
  }
  public String toString()
  {
    String s;
    if(imaginary<0)
    {
      s=real+""+imaginary+"i";
    }
    else
    s=real+"+"+imaginary+"i";
    return s;
  }
  
}