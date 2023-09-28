import java.io.*;
public class EX33{
	public static void main(String[] args) throws Exception{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Users\\kmred\\OneDrive\\Desktop\\data.txt"));
		dos.writeInt(25);
		dos.writeDouble(35.5);
		dos.writeBoolean(false);
		dos.close();
		DataInputStream dis=new DataInputStream(new FileInputStream("C:\\Users\\kmred\\OneDrive\\Desktop\\data.txt"));
		System.out.print(dis.readInt()+""+dis.readDouble()+dis.readBoolean());
		dos.close();
		dis.close();
	}
}