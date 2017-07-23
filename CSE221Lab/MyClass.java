import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MyClass
{
 public static void main (String[] args) throws java.lang.Exception
 {
   Scanner er=new Scanner(System.in);
  int t=0;
  for(int i=0; i<1; i++)
  {
    t=er.nextInt();
    if(t<1||t>30)
      i=-1;
  }
  for(int i=0; i<t; i++)
  {
    int [] f=new int[4];
    int [] s=new int[4];
    boolean fb=false;
    boolean sb=false;
    
    for(int j=0; j<4; j++)
    {
      for(int k=0; k<1; k++)
      {
        f[j]=er.nextInt();
        if(f[j]<0||f[j]>999)
          k=-1;
      }
    }
    if((f[0]+f[1])>(f[2]+f[3]))
      fb=true;
    for(int j=0; j<4; j++)
    {
      for(int k=0; k<1; k++)
      {
        s[j]=er.nextInt();
        if(s[j]<0||s[j]>999)
          k=-1;
      }
    }
    if((s[0]+s[1])>(s[2]+s[3]))
      sb=true;
    
    if(fb==true&&sb==true)
      System.out.println("Banglawash");
    else
      System.out.println("Miss");
  }
  
 }
}