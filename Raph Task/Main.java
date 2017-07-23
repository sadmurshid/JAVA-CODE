import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
 

public class Main {
  static Scanner er;
    
    public void performNSLookup() {
      
        
        try {
            
            //InetAddress inetHost = InetAddress.getByName("google-public-dns-a.google.com");
            //String hostName = inetHost.getHostName();
            InetAddress inet1=InetAddress.getByName(er.nextLine());
            System.out.println("The host name was: " + inet1.getHostName());
            System.out.println("Address: "+inet1.getAddress()[1]);
            System.out.println("The hosts IP address is: " + inet1.getHostAddress());
            System.out.println("The Local Host: "+ inet1.getLocalHost());
            System.out.println("The loopback address: "+ inet1.getLoopbackAddress());
            System.out.println("HashCode: "+inet1.hashCode());
            System.out.println("To String: "+ inet1.toString());
            
            
        } catch(UnknownHostException ex) {
            
            System.out.println("Unrecognized host");
        }
    }
    
    public static void main(String[] args) throws Exception
    {
      er=new Scanner(System.in);
        //new Main().performNSLookup();
      String [] str={er.nextLine()};//,"facebook.com","youtube.com"};
      WebClient.main(str);
    }
}