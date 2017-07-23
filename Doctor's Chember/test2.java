import java.util.Scanner;
class test2
{
  static int id=0;
  static ArrayQueue q;
  static Scanner er;
  
  
  public static void main(String[] args)
  {
    er=new Scanner(System.in);
    q=new ArrayQueue();
    
    System.out.println("Doctor will serve 20 patient today.");
    
    for(int i=0; i<1; i++)
    {
      System.out.println("Please select an option");
      System.out.println("1) Register Patient        2) Serve Patient ");
      System.out.println("3) Can Doctor Go Home      4) Show All Patient ");
      System.out.println("5) Cancel All              6) Exit");
      int v=(int)er.nextLine().charAt(0)-48;
      if(v==1)
      {
        RegisterPatient();
        i--;
      }
      else if(v==2)
      {
        ServePatient();
        i--;
      }
      else if(v==3)
      {
        if(CanDoctorGoHome()==false)
        {
          System.out.println("Yes, there is no patient left");
          break;
        }
        else
        {
          System.out.println("No, there are patients left");
          i--;
        }
      }
      else if(v==4)
      {
        ShowAllPatient();
        i--;
      }
      else if(v==5)
      {
        CancelAll();
        i--;
      }
      System.out.println(q.size);
    }
  }
  static void RegisterPatient()
  {
    try{
      patient p=new patient();
      System.out.println("Please enter name");
      p.name=er.nextLine();
      System.out.println(p.name);
      System.out.println("Please enter phone number");
      p.pNum=er.nextLine();
      id++;
      p.id=id;
      q.enqueue(p);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
  static void ServePatient()
  {
    try
    {
      q.dequeue();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
  static boolean CanDoctorGoHome()
  {
    return q.isEmpty();
  }
  static void ShowAllPatient()
  {
    Object [] ob=new Object[q.size];
    patient[] so=q.toArray(new patient[q.size()]);
    //Object [] so=q.toArray();
    for(int i=0; i<ob.length; i++)
    {
      ob[i]=so[i];
    }
//    for(int i=0; i<q.size; i++)
//    {
//      for(int j=i; j<q.size; j++)
//      {
//        if(ob[i].name.compareTo(ob[j].name)>0)
//        {
//          Object temp=ob[i];                         planet[] so=q.toArray(new planet[]);
//          ob[i]=ob[j];
//          ob[j]=temp;
//        }
//      }
//    }
    String str=ob[0].getName();
    for(int i=0; i<ob.length; i++)
    {
      System.out.println(ob[i].toString());
    }
  }
  static void CancelAll()
  {
    try
    {
      for(int i=0; i<q.size; i++)
      {
        q.dequeue();
      }
    }
    catch(Exception p)
    {
      System.out.println(p);
    }
  }
}