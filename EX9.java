import java.net.*;
import java.io.*;
class EX9{
	public static void main(String[] args) throws Exception{
		
		Socket s=new Socket("localhost",1234);
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equals("stop")){
			str1=b.readLine();
			dos.writeUTF(str1);
			str2=dis.readUTF();
			System.out.println(str2);
			
		}
		dis.close();dos.close();b.close();
	}
}
		