public class ArrayQueue implements Queue
{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[5];
    }
    
    public int size()
    {
      return size;
    }
    
    public boolean isEmpty()
    {
      boolean b=false;
      if(size!=0)
        b=true;
      return b;
    }
    
    public void enqueue(Object o) throws QueueOverflowException
    {
      try
      {
        if(size==data.length)
        {
          throw new QueueOverflowException();
        }
        else if(size==0)
        {
          front=0;
          rear=0;
          data[0]=o;
          size++;
        }
        else
        {
          rear=(rear+1)%data.length;
          data[rear]=o;
          size++;
        }
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
    
    public Object dequeue() throws QueueUnderflowException
    {
      Object ob=null;
      try
      {
        if(size==0)
        {
          throw new QueueUnderflowException();
        }
        else
        {
          ob=data[front];
          front=(front+1)%data.length;
          size--;
        }
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
      return ob;
    }
    
    public Object peek() throws QueueUnderflowException
    {
      Object ob=null;
      try
      {
        if(size==0)
        {
          throw new QueueUnderflowException();
        }
        else
        {
          ob=data[front];
        }
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
      return ob;
    }
    
    public String toString()
    {
      String str="[ ";
      int c=front;
      for(int i=0; i<size; i++)
      {
        str=str+data[c]+" , ";
        c=(c+1)%data.length;
      }
      str=str+" ]";
      return str;
    }
    
    public Object[] toArray()
    {
      Object[] o=new Object[size];
      int c=front;
      for(int i=0; i<size; i++)
      {
        o[i]=data[c];
        c=(c+1)%data.length;
      }
      return o;
    }
    
    public int search(Object o)
    {
      int idx=-1;
      int c=front;
      for(int i=0; i<size; i++)
      {
        if(o.equals(data[c]))
        {
          idx=i;
          break;
        }
        c=(c+1)%data.length;
      }
      return idx;
    }
}