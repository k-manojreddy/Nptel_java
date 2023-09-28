import java.io.*;
public class EX29{
	public static void main(String args[])throws IOException{
		File f;
		if(args.length>0){
			for(int i=0;i<args.length;i++){
				f=new File(args[i]);
				System.out.println(f.getAbsolutePath());
				//f.getAbsolutePath();
			}
		}
	}
}