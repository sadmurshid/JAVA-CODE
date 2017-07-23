class print
{
  int size;
  print(int [] parent)
  {
    size=parent.length;
    int source=-1;
    for(int i=0; i<size; i++)
    {
      if(parent[i]==0)
      {
        source=i;
        System.out.println(source);
        break;
      }
    }
    
  }
}