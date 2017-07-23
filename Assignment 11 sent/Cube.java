class Cube
{
  public int arm;
  
  public void printVolume()
  {
    long v=arm*arm*arm;
    System.out.println("Volume = "+v);
  }
  public void setArm(int x)
  {
    arm= x;
  }
}