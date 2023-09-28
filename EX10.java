import java.net.*;
import java.io.*;
public class EX10
{
	public static void main(String[] args)  {
	    try{
		InetAddress ip=InetAddress.getByName("www.nptel.ac.in");
		System.out.print(ip.getHostName()+"\n"+ip.getHostAddress());
	    }
	    catch(Exception e){
	        System.out.print(e);
	    }
		/*System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getFile());*/
	}
}