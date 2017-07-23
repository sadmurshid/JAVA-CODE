/*
   Programmer : Sa'd Murshid Khan Adon 
   Problem    : Read a number from user and reply whether the number
                     is a palindrom number or not.
   version    : 1.0.0
                                                                        */

import java.util.Scanner;
class Extrav1p0p0
{
  public static void main(String[] args)
  {
    Scanner er= new Scanner(System.in);
    long x, y, a,z;
    System.out.println("Plese enter a number.");
    a=er.nextLong();
    int c = 0;
    y=a;
    
    //Counting how many charecter user entered
    for( x=a; x>0; x=x/10)
    {
      c=c+1;
    }
    int d=c;
    
    // Initializing Array
    int [] s=new int[c];
    int i=0;
    System.out.println("c "+c);
    
    // entering value in array
    for (c=c-1; c>=0; c--)
    {
      z=(int)(y/Math.pow(10,c));
      y=(int)(y%Math.pow(10,c));
      
      if (z==1)
      {
        s[i]=1;
      }
      else if (z==2)
      {
        s[i]=2;
      }
      else if(z==3)
      {
        s[i]=3;
      }
      else if(z==4)
      {
        s[i]=4;
      }
      else if(z==5)
      {
        s[i]=5;
      }
      else if(z==6)
      {
        s[i]=6;
      }
      else if(z==7)
      {
        s[i]=7;
      }
      else if(z==8)
      {
        s[i]=8;
      }
      else if(z==9)
      {
        s[i]=9;
      }
      else 
      {
        s[i]=0;
      }
      
      i++;
    }
    // Chacking whether the array is palindrom or not
    int b=0,e=1,f;
    if (d%2==0)
    {
      // If the counter is Even
      e=d/2-1;
      f=e;
      while(s[e-f]==s[e+f+1]&&f>=0)
      {
        f--;
        b++;
      }
    }
    else
    {
      // odd 
      e=(d-1)/2;
      f=e;
      while(s[e-f]==s[e+f]&&f>0)
      {
        f--;
        b++;
      }
      b++;
    }
    
    System.out.println("d "+d);
    System.out.println("e "+e);
    System.out.println("f "+f);
    System.out.println("b "+b);
    System.out.println(s[7]+"  s[e+f+1]");
    for(int bf=0; bf<8; bf++)
    {
      System.out.println(s[bf]+" s[bf]");
    }
    
    // Printing decision
    if (b-1==e)
    {
      System.out.println("Your entered number is a palinhdrom number.");
    }
    else
    {
      System.out.println("Your entered number is not a palinhdrom number.");
    }
    
    System.out.println(a);
  }
  
}