import java.io.*; 
import java.net.*;

public class EchoClient {
  public static void main (String args[]) {

    String host = args.length>0 ? args[0] : "localhost";
    String line;

    try {
      Socket s = new Socket(host, 2000);

      BufferedReader netIn = new BufferedReader(
             new InputStreamReader(s.getInputStream()));
      PrintWriter netOut = 
             new PrintWriter(s.getOutputStream(),true);
      BufferedReader sysIn = new BufferedReader(
             new InputStreamReader(System.in));

     while (!(line = sysIn.readLine()).matches("exit|quit")) {
        netOut.println(line);
        System.out.println(netIn.readLine());
     }
   } catch (UnknownHostException e) { 
        System.err.println(e);
   } catch (IOException e) {
        System.err.println(e);
   }  
 }
}