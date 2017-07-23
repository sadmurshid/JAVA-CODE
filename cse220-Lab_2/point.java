class point
{
  int x;
  int y;
  
  point(int ex, int oi)
  {
    x=ex;
    y=oi;
  }
  
  double distanceFromOrigin()
  {
    return Math.sqrt((x*x)+(y*y));
  }
  
  
}