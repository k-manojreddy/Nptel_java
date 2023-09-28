import java.io.*;
public class EX32{
	public static void main(String[] args)throws Exception{
		FileReader fr=new FileReader("C:\\Users\\kmred\\OneDrive\\Desktop\\IOtest.txt");
		FileWriter fw=new FileWriter("C:\\Users\\kmred\\OneDrive\\Desktop\\copy.txt");
		int a;
		while((a=fr.read())!=-1){
			fw.write(a);
		}
		fr.close();
		fw.close();
	}
}