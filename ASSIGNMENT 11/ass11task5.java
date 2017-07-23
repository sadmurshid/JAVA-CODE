class ass11task5
{
  public static void main(String args [])
  {
    BankAccount acc1=new BankAccount();
    acc1.setName("Mizanur Rahman");
    acc1.setAdress("51/a East Nakhalpara Mohakhali");
    acc1.setAccountID("15115630001");
    acc1.setBalance(35853.77);
    
    System.out.println("Account Holder Name : "+acc1.getName());
    System.out.println("Account Holder Adress : "+acc1.getAdress());
    System.out.println("Account ID : "+acc1.getAccountID() );
    System.out.println("Account Balance : "+acc1.getBalance());
    acc1.addInterest();
    
  }
}