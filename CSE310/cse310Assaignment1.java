/*****************************************************************
  *      Programmer : Sa'd Murshid Khan Adon                     * 
  *             BRAC University                                  *
  *      ID         : 14301101                                   *
  *      Date       : 14 May 2017                                *
  *      Course     : CSE310                                     *
  *                                                              *
  ****************************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class cse310Assaignment1
{
  static char [][] char2D;
  public static void main(String[] args) throws IOException
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter your choice");
    System.out.println("1. BlowUp 2.MaxRun 3.CharGrid");
    int choice=er.nextInt();
    if(choice==1)
    {
      System.out.println("Please enter the String");
      String str=er.next();
      blowup(str);
    }
    else if(choice==2)
    {
      System.out.println("Please enter the String");
      String str=er.next();
      System.out.println(maxRun(str));
    }
    else if(choice==3)
    {
      System.out.println("Take Input From");
      System.out.println("1.System Input   2.txt File");
      int choice2=er.nextInt();
      if(choice2==1)
      {
        System.out.println("Enter the size/length");
        int len=er.nextInt();
        char2D=new char[len][len];
        er.nextLine();
        for(int i=0; i<len; i++)
        {
          String s=er.nextLine();
          for(int j=0; j<len; j++)
            char2D[i][j]=s.charAt(j);
        }
      }
      else if(choice2==2)
      {
        System.out.println("1st need the size and then array");
        FileReader fr=new FileReader(er.next());
        BufferedReader br=new BufferedReader(fr);
        String s=br.readLine();
        int len=Integer.parseInt(s);
        char2D=new char[len][len];
        for(int i=0; i<len; i++)
        {
          s=br.readLine();
          for(int j=0; j<len; j++)
            char2D[i][j]=s.charAt(j);
        }
      }
      System.out.println("Enter the Char");
      char ch=er.next().charAt(0);
      int area=charArea(ch);
      System.out.println("AREA = "+area);
    }
  }
  static void blowup(String str)
  {
    char [] charArray=str.toCharArray();
    for(int i=0; i<charArray.length; i++)
    {
      int intChar=(int)charArray[i];
      if(intChar>47 && intChar<58 && i<(charArray.length-1))
      {
        int intVal=intChar-48;
        for(int j=0; j<intVal; j++)
        {
          System.out.print(charArray[i+1]);
        }
        i++;
      }
      else if(intChar>47 && intChar<58)
      {
      }
      else
        System.out.print(charArray[i]);
    }
    System.out.println();
  }
  
  static int maxRun(String str)
  {
    char charArray []=str.toCharArray();
    int maxRun=1, runInt=1;
    char runChar=charArray[0];
    for(int i=1; i<charArray.length; i++)
    {
      if(charArray[i]==runChar)
      {
        runInt++;
        if(runInt>maxRun)
          maxRun=runInt;
      }
      else
      {
        runChar=charArray[i];
        runInt=1;
      }   
    }
    return maxRun;
  }
  static int charArea(char ch)
  {
    int coSt=99, coEn=-1, roSt=99, roEn=-1;
    for(int i=0; i<char2D.length; i++)
    {
      for(int j=0; j<char2D.length; j++)
      {
        if(char2D[i][j]==ch)
        {
          if(coSt>j)
            coSt=j;
          if(coEn<j)
            coEn=j;
          if(roSt>i)
            roSt=i;
          if(roEn<i)
            roEn=i;
        }
      }
    }
    return (roEn-roSt+1)*(coEn-coSt+1);
  }
  
}