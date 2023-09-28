import java.io.*;
public class EX34{
	public static void main(String[] args) throws Exception{
		RandomAccessFile f=new RandomAccessFile("C:\\Users\\kmred\\OneDrive\\Desktop\\data.txt","rw");
		f.writeInt(25);
		f.writeDouble(35.8);
		f.seek(0);
		f.writeBoolean(false);
		f.writeChar('A');
		
		System.out.println(f.readBoolean()+""+f.readChar()+""+f.readInt()+""+f.readDouble());
		f.close();
	}
}