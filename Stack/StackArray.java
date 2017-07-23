import java.lang.Throwable;
class StackArray  extends Exception //implements Stack
{
   Object [] Stack;
   int top;
  StackArray()
  {
    Stack=new Object[10];
    top=-1;
  }
  StackArray(int capacity)
  {
    Stack=new Object[capacity];
    top=-1;
  }
  public int size()
  {
    return (top+1);
  }
  public boolean isEmpty()
  {
    if(top==-1)
      return true;
    else
      return false;
  }
  public void push(Object o) //throws StackOverflowException
  {
    if(top==Stack.length)
    {
    }
    else
    {
      Stack[++top]=o;
    }
  }
  public Object pop()
  {
    Object j=null;
    if(top==Stack.length)
    {
      
    }
    else 
    {
      j=Stack[top];
      Stack[top]=null;
      top --;
    }
    return j;
  }
  Object peek()
  {
    if(top==Stack.length)
    {
      return null;
    }
    else 
    {
      return Stack[top];
    }
  }
  public String toString()
  {
    String str="]";
    
    for(int i=0; i<Stack.length; i++)
    {
      str=Stack[i]+" "+str;
    }
    str="["+str;
    return str;
  }
  
}