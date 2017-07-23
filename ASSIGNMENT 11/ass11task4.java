import java.util.Scanner;
class ass11task4
{
  public static void main(String agrs [])
  {
    Scanner er= new Scanner(System.in);
    student john = new student();
    john.setName("John");
    john.setID("1430031");
    john.setAddress("51/A Gohailkandi, Mymensingh");
    john.setCgpa(3.4);
    System.out.println(john.getName());
    System.out.println(john.getID());
    System.out.println(john.getAddress());
    System.out.println(john.getCgpa());
    
    student mike = new student();
    mike.setName("Mike");
    mike.setID("1430032");
    mike.setAddress("312 East Nakhalpara, Tejgon, Dhaka");
    mike.setCgpa(3.5);
    System.out.println(mike.getName());
    System.out.println(mike.getID());
    System.out.println(mike.getAddress());
    System.out.println(mike.getCgpa());
    
    student carol = new student();
    carol.setName("Carol");
    carol.setID("1430033");
    carol.setAddress("36 West Nakhalpara, Tejgon, Dhaka");
    carol.setCgpa(3.6);
    System.out.println(carol.getName());
    System.out.println(carol.getID());
    System.out.println(carol.getAddress());
    System.out.println(carol.getCgpa());
    
  }
  
}