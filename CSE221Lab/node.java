class node
{
  node next;
  node prev;
  node subNext=null;
  node subPrev=null;
  int name;
  int friend=-1;
  
  node(node p, node n)
  {
    prev=p;
    next=n;
  }
  
  node(node p, node n, int f)
  {
    prev=p;
    next=n;
    friend=f;
//    System.out.println(friend);
  }
  
  void sub(int f, node sn, node sp)
  {
    subPrev=sp;
    subNext=sn;
    friend=f;
  }
  
  public String toString()
  {
    return ""+friend;
  }
}