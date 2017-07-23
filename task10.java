import java.util.Scanner;
 public class task10{ 
   public static String season(int m,int d){
     String s="";
     if((m>=12&&d>=16)||(m<3)||(m==3&&d<16)){
       s="winter";
       System.out.println("test1");
     }
     if((m>=3&&d>=16)||(m==6&&d>16)){
        s="Spring";
        System.out.println("test2");
     }
     if((m>=6&&d>=16)||(m==9&&d>16)){
        s="summer";
        System.out.println("test3");
     }
     if((m>=9&&d>=16)||(m==12&&d>16)){
       s="Fall";
       System.out.println("test4");
     }
    return s;
   }
   public static void main (String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the mounth");
     int m=sc.nextInt();
     System.out.println("enter the day");
     int d=sc.nextInt();
     if((m>0&&m<=12)&&(d>0&&d<=31)){
       System.out.println("test");
       System.out.println(task10.season(m,d));
     }
   }
 }