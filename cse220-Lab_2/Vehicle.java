class Vehicle
{
  int x;
  int y;
  
  public Vehicle()
  {
    x=0;
    y=0;
  }
  
  public void moveUp()
  {
    y++;
  }
  public void moveDown()
  {
    y--;
  }
  public void moveRight()
  {
    x++;
  }
  public void moveLeft()
  {
    x--;
  }
  public String toString()
  {
    return "("+x+","+y+")";
  }
}