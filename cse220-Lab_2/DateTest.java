import java.util.Scanner;
class DateTest
{
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter date, month and year");
    
    Date d=new Date(er.nextInt(),er.nextInt(),er.nextInt());
    System.out.println(d.displayDate());
    
  }
}