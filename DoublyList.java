public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        Node n=new Node(null, null, null);
        int cou=0;
        n=head.next;
        while(n!=head)
        {
          cou++;
          n=n.next;
        }
        return cou; 
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        Node n=new Node(null, null, null);
        
        n=head.next;
        while(n.next!=head)
        {
          System.out.print(n.element+",");
          n=n.next;
        }
        System.out.print(n.element+".");
        System.out.println();
    }
    
    public void backwardprint(){
        Node n=new Node(null, null, null);
        
        n=head.prev;
        while(n.prev!=head)
        {
          System.out.print(n.element+",");
          n=n.prev;
        }
        System.out.print(n.element+".");
        System.out.println();  
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        Node n=new Node(null, null, null);
        n=head.next;
        for(int i=0; i<idx; i++)
        {
          n=n.next;
          if(n.next==head)
          {
            n.element="nullPointerException.";
            return n;
          }
        }
        return n; 
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
      Node n=new Node(null, null, null);
      n=head.next;
      int i=0;
      while(n.element!=elem)
      {
        if(n.next==head)
          return -1;
        n=n.next;
        i++;
      }
        return i; 
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
      if((idx<=countNode())&&(idx>=0))
      {
        Node ne=new Node(elem, null, null);
        Node n=new Node(null, null, null);
        n=head.next;
        for(int i=0; i<idx; i++)
        {
          n=n.next;
        }
        ne.next=n;
        ne.prev=n.prev;
        n.prev=ne;
        ne.prev.next=ne;
      }
      else
        System.out.println("Invalid index");
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        if((index<=countNode())&&(index>=0))
        {
          Node n=new Node(null, null, null);
          n=head.next;
          for(int i=0; i<index; i++)
          {
            n=n.next;
          }
          n.next.prev=n.prev;
          n.prev.next=n.next;
          n.next=null;
          n.prev=null;
          return n.element;
        }
        
        
        return null;
    }
    
    
    
}