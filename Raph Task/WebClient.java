import java.io.*;
import java.net.*;

public class WebClient {
  public static void main(String[] args) throws Exception {
    if (args.length != 1) {
      System.err.println("Usage: WebClient <url>");
      return;
    }
    URL url = new URL(args[0]);
    URLConnection connection = url.openConnection();
    connection.connect();
    InputStream in = connection.getInputStream();
    try {
      byte[] buf = new byte[1024];
      int nread = 0;
      while ((nread = in.read(buf)) > 0) {
        System.out.write(buf, 0, nread);
      }
      System.out.flush();
    } finally {
      in.close();
    }
  }
}