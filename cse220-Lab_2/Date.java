class Date
{
  int d;
  int m;
  int y;
  Date(int d, int m, int y)
  {
    this.d=d;
    this.m=m;
    this.y=y;
  }
  
  void setDate(int da)
  {
    d=da;
  }
  
  void setMonth(int mo)
  {
    m=mo;
  }
  void setYear(int ye)
  {
    y=ye;
  }
  
  int getDate()
  {
    return d;
  }
  int getMonth()
  {
    return m;
  }
  int getYear()
  {
    return y;
  }
  public String displayDate()
  {
    return d+" / "+m+" / "+y;
  }
  
}