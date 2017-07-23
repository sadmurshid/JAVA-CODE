class testStack
{
  public static void main(String [] args)
  {
    StackArray s1=new StackArray(6);
    s1.push(98);
    System.out.println(s1.toString());
    s1.push(87);
    s1.push(45);
    s1.push(23);
    System.out.println(s1.size());
    System.out.println(s1.toString());
    s1.pop();
    System.out.println(s1.toString());
    System.out.println(s1.size());
    
  }
    
}