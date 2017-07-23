class BankAccount
{
  public String name;
  public String adress;
  public String accountID;
  public double balance;
  
  public String getName()
  {
    return name;
  }
  public void setName(String n)
  {
    name = n;
  }
  public String getAdress()
  {
    return adress;
  }
  public void setAdress(String a)
  {
    adress = a;
  }
  public String getAccountID()
  {
    return accountID;
  }
  public void setAccountID(String i)
  {
    accountID = i;
  }
  public double getBalance()
  {
    return balance;
  }
  public void setBalance(double b)
  {
    balance = b;
  }
  public void addInterest()
  {
    double z;
    z= balance+(balance*0.07);
    System.out.println("Balance with interest : "+z);
  }
  
}