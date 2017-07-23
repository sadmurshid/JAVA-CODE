class date
{
  public int m;
  public int d;
  public int y;
  
  public date(int x, int y, int z)
  {
    m =x;
    d =y;
    this.y =z; 
    
  }
  public void displayDate()
  {
    System.out.println(m+" / "+d+" / "+y);
  }
}