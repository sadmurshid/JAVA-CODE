public class ArrayStack implements Stack{
  int size;
  int top;
  Object [] data;
  
  public ArrayStack(){
    size=0;
    top =-1;
    data = new Object[5];
  }
  public int size()
  {
    return size;
  }
  
  public boolean isEmpty()
  {
    if(size==0)
      return true;
    else
      return false;
  }
  public void push(Object o) throws StackOverflowException
  {
      if(top==data.length-1)
      {
        throw new StackOverflowException();
      }
      else
      {
        data[++top]=o;
        size++;
      }
    

  }
  
  public Object pop() throws StackUnderflowException
  {
    Object j=null;
    
      if(top==data.length)
      {
        throw new StackUnderflowException();
      }
      else 
      {
        j=data[top];
        data[top]=null;
        top --;
        size--;
      }
    
    return j;
  }
  
  public Object peek() throws StackUnderflowException
  {
      if(top==data.length)
      {
        throw new StackUnderflowException();
      }
    
    
    return data[top];
  }
  public String toString()
  {
    String str="]";
    
    for(int i=0; i<data.length; i++)
    {
      str=data[i]+" "+str;
    }
    str="["+str;
    return str;
  }
  public Object[] toArray()
  {
    return data;
  }
  
  public int search(Object e)
  {
    int ite=-1;
    for(int i=0; i<size; i++)
    {
      if(e.equals(data[i]))
      {
        ite=i;
        break;
      }
    }
    return ite;
  }
}