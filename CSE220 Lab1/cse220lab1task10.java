import java.util.Scanner;
class cse220lab1task10
{
  public static void main(String[] args)
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Please enter the date");
    int date=er.nextInt();
    System.out.println("Please enter the Month");
    int month=er.nextInt();
    
    System.out.println(season(date,month));
  }
  
  public static String season(int d, int m)
  {
    String sea="";;
    if((m<3)||(m==3 && d<16)||(m==12&&d>15))
    {
      sea="Winter";
    }
    else if((m==3 && d>15)||(m<6)||(m==6 && d<16))
    {
      sea="Spring";
    }
    else if((m==6 && d>15)||(m<9)||(m==9 && d<16))
    {
      sea="Summer";
    }
    else if((m==9 && d>15)||(m<12)||(m==12 && d<16))
    {
      sea="Fall";
    }
    return sea;
  }
}