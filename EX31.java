import java.io.*;
public class EX31{
	public static void main(String[] args) throws Exception{
		FileOutputStream f=new FileOutputStream("C:\\Nptel\\IOwrite.txt");
		byte b[]={'H','E','L','L','O',' ','U','S','E','R','\n','W','E','L','C','O','M','E'};
		//for(int i=0;i<b.length;i++){
			f.write(b);
		//}
		f.close();
	}
}