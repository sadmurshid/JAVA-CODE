public class ListQueue implements Queue
{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
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
        Node n=new Node(o, null);
        if(front==null)
        {
          front=n;
          rear=n;
          size++;
        }
        else
        {
          rear.next=n;
          rear=n;
          size++;
        }
      }
      catch (Exception e)
      {
        System.out.println(e);
      }
      
    }
    
    public Object dequeue() throws QueueUnderflowException
    {
      Node n=new Node(null, null);
      Object ob=n.val;
      try{
        
        if(front==null)
        {
          throw new QueueUnderflowException();
        }
        else
        {
          n=front;
          ob=n.val;
          n.val=null;
          front=front.next;
          size--;
          n.next=null;
        }
      }
      catch(Exception  e)
      {
        System.out.println(e);
      }
      return ob;
    }
    
    public Object peek() throws QueueUnderflowException
    {
      Object ob=front.val;
      try
      {
        if(front==null)
        {
          throw new QueueUnderflowException();
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
      Node n=front;
      for(int i=0; i<size; i++)
      {
        str=str+n.val+" , " ;
        n=n.next;
      }
      str=str+" ]";
      return str;
    }
    
    public Object[] toArray()
    {
      Object[] ob=new Object[size];
      Node n=front;
      for(int i=0; i<size; i++)
      {
        ob[i]=n.val;
        n=n.next;
      }
      return ob;
    }
    
    public int search(Object o)
    {
      int idx=-1;
      Node n=front;
      for(int i=0; i<size; i++)
      {
        if(o.equals(n.val))
        {
          idx=i;
          break;
        }
        n=n.next;
      }
      return idx;
    }
}