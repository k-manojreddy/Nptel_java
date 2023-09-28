import java.net.*;
import java.io.*;
class EX8{
	public static void main(String[] args) throws Exception{
		ServerSocket ss= new ServerSocket(1234);
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equals("stop")){
			str1=dis.readUTF();
			System.out.println(str1);
			str2=b.readLine();
			dos.writeUTF(str2);
		}
		dis.close();dos.close();b.close();
	}
}
		