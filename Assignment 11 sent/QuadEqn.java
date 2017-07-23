class QuadEqn
{
  public int a;
  public int b;
  public int c;
  int real(int a, int b, int c)
  {
    this.a=a;
    this.b=b;
    this.c=c;
    int x= 0;
    long Discriminant=(int)Math.pow(b,2)-(4*a*c);
    System.out.println(Discriminant);
    
    if(Discriminant >0)
    {
      x=2;
    }
    else if(Discriminant ==0)
    {
      x=1;
    }
    else if(Discriminant <0)
    {
      x=0;
    }
    return x;
  }
  String equation()
  {
    String x="";
    if(a==1 && b==1 && c>0)
    {
      x="x2+x+"+c;
    }
    else if(a==1 && b>0 && c>0)
    {
      x="x2+"+b+"+"+c;
    }
    else if(a==1 && b<0 && c>0)
    {
      x="x2"+b+"+"+c;
    }
    else if (b==1 && c>0)
    {
      x=a+"x2+x+"+c;
    }
    else if (a==1 && b==1 && c<0)
    {
      x="x2+x"+c;
    }
    else if(a==1 && b>0 && c<0)
    {
      x="x2+"+b+c;
    }
    else if(a==1 && b<0 && c<0)
    {
      x="x2"+b+c;
    }
    else if(b==1 && c<0)
    {
      x=a+"x2+x"+c;
    }
    return x;
  }
  int value(int x)
  {
    int value=0;
    value=((-b+x*((int)Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));
    
    return value;
  }
  
  
  
}