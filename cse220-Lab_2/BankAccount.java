class BankAccount
{
  String name;
  String id;
  String address;
  double balance;
  
  public BankAccount()
  {
    name="";
    id="";
    address="";
    balance=0.0;
  }
  public BankAccount(String n, String i, String a, double c)
  {
     name=n;
     id=i;
     address=a;
     balance=c;
  }
  
    public String getName()
    {
      return name;
    }
    public void setName(String n)
    {
      name=n;
    }
    public String getAccountID()
    {
      return id;
    }
    public void setAccountID(String i)
    {
      id=i;
    }
    public String getAddress()
    {
      return address;
    }
    public void setAddress(String a)
    {
      address=a;
    }
    public double getBalance()
    {
      return balance;
    }
    public void setBalance(double c)
    {
      balance=c;
    }
    public void addInterest() //adds 7% of the balance
    {
      balance=balance*(balance*.07);
    }
    
}