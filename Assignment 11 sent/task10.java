class task10
{
  public String season(int m, int d)
  {
    String x="";
    if(m<3)
    {
      x="Winter";
    }
    else if(m==3 && d<16)
    {
      x="Winter";
    }
    else if(m<6)
    {
      x="Spring";
    }
    else if(m==6 && d<16)
    {
      x="Spring";
    }
    else if (m<9)
    {
      x="Summer";
    }
    else if(m==9 && d<16)
    {
      x="Summer";
      
    }
    else 
      x="Fall";
    
    
    return x;
  }
}