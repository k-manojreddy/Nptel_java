import java.io.*;
public class EX36{
	public static void main(String[] args)throws Exception{
		FileInputStream f=new FileInputStream("C:\\Users\\kmred\\OneDrive\\Desktop\\words.txt");
		int a=0,w=0;StringBuffer s=new StringBuffer("");
		while((a=f.read())!=-1){
			//s.append((char)a);
			
			char c=(char)a;
			if(c==' '||c=='\n'){
				w++;
			}
			
		}
		//String sn[]=s.toString().split(" ");
		//System.out.print(sn.length);
		System.out.print(w);
	}
}
			