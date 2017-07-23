import java.net.*;
import java.util.*;

public class NICs {
  public static void main(String[] args) throws Exception {
    for (Enumeration nis = NetworkInterface.getNetworkInterfaces(); nis.hasMoreElements();)
    {
      NetworkInterface ni = (NetworkInterface) nis.nextElement();
      System.out.println(ni.getDisplayName());
      for (Enumeration ias = ni.getInetAddresses(); ias.hasMoreElements();) 
      {
        InetAddress ia = (InetAddress) ias.nextElement();
        System.out.println("\t"+"ADD: " + ia.getHostAddress());
      }
    }
  }
}
