import java.util.Scanner;
public class Main {
    public static void main(String[] ars)
    {
        Scanner er=new Scanner(System.in);
        BankAccount acc1=new BankAccount();
        BankAccount acc2=new BankAccount();
        BankAccount acc3=new BankAccount();
        
        acc1.setName("Fazle Rabbi Rion");
        acc1.setAccountID("Pagol 001");
        acc1.setAddress("Hemayetpur, Pabna");
        acc1.setBalance(1500);
        
        acc2.setName("Abdullah Umar Nasib");
        acc2.setAccountID("Pagol 002");
        acc2.setAddress("Hemayetpur, Shatkhira");
        acc2.setBalance(1900);
        
        acc3.setName("Md. Minhaz Masrur Haque");
        acc3.setAccountID("Pagol 003");
        acc3.setAddress("Hemayetpur, Chapainobabgonj");
        acc3.setBalance(2300);
        
        System.out.println(acc1.getName());
        System.out.println(acc1.getAccountID());
        System.out.println(acc1.getAddress());
        System.out.println(acc1.getBalance());
        
        System.out.println(acc2.getName());
        System.out.println(acc2.getAccountID());
        System.out.println(acc2.getAddress());
        System.out.println(acc2.getBalance());
        
        System.out.println(acc3.getName());
        System.out.println(acc3.getAccountID());
        System.out.println(acc3.getAddress());
        System.out.println(acc3.getBalance());
        
        acc1.addInterest();
        acc3.addInterest();
        
        System.out.println(acc1.getBalance());
        System.out.println(acc3.getBalance());
        
    }
    
}
