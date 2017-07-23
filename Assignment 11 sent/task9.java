class task9
{
  
  public void display(int []x, int y)
  {
    for (int i=0; i<10; i++)
    {
      System.out.println(x[i]);
    }
  }
  public int [] square(int []x, int y)
  {
    for(int i=0; i<10; i++)
    {
      x[i]=x[i]*x[i];
    }
    return x;
  }
}