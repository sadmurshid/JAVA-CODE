class patient
{
  int id;
  public String name;
  String pNum;
  patient()
  {
    id=0;
    name=null;
    pNum=null;
  }
  patient(int i, String n, String p)
  {
    id =i;
    name=n;
    pNum=p;
  }
  String getName()
  {
    return name;
  }
  public String toString()
  {
    String str="ID           : "+id+"\n"+"Name         : "+name+"\n"+"Phone Number :"+pNum+"\n";
    return str;
  }
}