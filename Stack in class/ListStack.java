public class ListStack implements Stack{
  int size;
  Node top;
  
  
  public ListStack(){
    size = 0;
    top = null;
  }
  public int size()
  {
    return size;
  }
  
  public boolean isEmpty()
  {
    if(top.val==null)
      return true;
    else
      return false;
  }
  
  public void push(Object e) throws StackOverflowException
  {
    Node n=new Node(e, null);
    n.next=top;
    top=n;
    size++;
  }
  
  public Object pop() throws StackUnderflowException
  {
    Node n=new Node(null, null);
    if(top==null)
      throw new StackUnderflowException();
    else
    {
      n=top;
      top=top.next;
      size--;
    }
    return n.val;
  }
  
  public Object peek() throws StackUnderflowException
  {
    Node n=new Node(null, null);
    if(top==null)
      throw new StackUnderflowException();
    else
    {
      n=top;
    }
    return n.val;
  }
  
  public Object[] toArray()
  {
    Object [] a=new Object[size];
    Node n=new Node(null, null);
    n=top;
    for(int i=0; i<size; i++)
    {
      a[i]=n.val;
      n=n.next;
    }
    
    return a;
  }
  
  public String toString()
  {
    String str="[ ";
    Node n=top;
    for(int i=0; i<size; i++)
    {
      str=str+n.val+" , ";
      n=n.next;
    }
    str=str+"]";
    return str;
  }
  
  public int search(Object e)
  {
    Node n=new Node(null, null);
    n=top;
    int idx=-1;
    for(int i=0; i<size; i++)
    {
      if(n.val.equals(e))
      {
        idx=i;
        break;
      }
      n=n.next;
    }
    return idx;
  }
}