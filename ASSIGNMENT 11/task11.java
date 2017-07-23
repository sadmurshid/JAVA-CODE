class task11
{
  boolean allOdds(long x)
  {
    boolean ab=false;
    long a=x;
    int c=0,b;
    //Counting charecters
    for(long i=a; i>0; i=i/10)
    {
      c=c+1;
    }
    
    int d=c;                  //Making duplicate of counter c
    System.out.println("c "+c);
    
    int [] arr=new int [c];    //Initializing array
    
    //Putting into array
    for(int i=0; i<c; i++)
    {
      d--;
      b=(int)(a/Math.pow(10,d));
      a=(int)(a%Math.pow(10,d));
      if (b==0)
      {
        arr[i]=0;
      }
      else if (b==1)
      {
        arr[i]=1;
      }
      else if (b==2)
      {
        arr[i]=2;
      }
      else if (b==3)
      {
        arr[i]=3;
      }
      else if (b==4)
      {
        arr[i]=4;
      }
      else if (b==5)
      {
        arr[i]=5;
      }
      else if (b==6)
      {
        arr[i]=6;
      }
      else if (b==7)
      {
        arr[i]=7;
      }
      else if (b==8)
      {
        arr[i]=8;
      }
      else if (b==9)
      {
        arr[i]=9;
      }
    }
    
    for (int i=0; i<c; i++)
    {
      System.out.println("arr[ "+i+" ] : "+arr[i]);
    }
    
    
    
    
    
    return ab;
  }
}