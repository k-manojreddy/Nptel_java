import java.io.*;
class EX30{
	public static void main(String[] args)throws IOException{
		FileInputStream f=new FileInputStream("C:\\Users\\kmred\\OneDrive\\Desktop\\IOtest.txt");
		System.out.println(f.available());
		/*for(int i=0;i<f.available()/2;i++){
			System.out.print((char)f.read());
		}
		System.out.println("\n"+f.available());
		for(int i=0;i<f.available();i++){
			System.out.print((char)f.read());
		}
		System.out.println("\n"+f.available());*/
		int i=0;
		while(true){
		int a=f.read();; 
		if(a!=-1){
			i++;
			System.out.print((char)a);
		}
		else {break;}
		}
		System.out.print("\n"+i);
	}
}