import java.net.*;
import java.io.*;
class EX5{
	public static void main(String[] args) throws Exception{
		//URL url=new URL("https://nptel.ac.in/course.php");
		
		/*System.out.println("Protocol:"+url.getProtocol());
		System.out.println("Host:"+url.getHost());
		System.out.println("Port:"+url.getPort());
		System.out.println("Filename:"+url.getFile());*/
		URL url=new URL("https://sreenidhi.edu.in/");
		URLConnection uc=url.openConnection();
		InputStream is=uc.getInputStream();
		int b;
		while((b=is.read())!=-1){
			System.out.print((char)b);
		}
	}
}
		