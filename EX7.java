import java.net.*;
class EX7{
	public static void main(String[] args)throws Exception{
		DatagramSocket ds=new DatagramSocket(3000);
		String s="HELLO WORLD!";
		InetAddress ip=InetAddress.getByName("127.0.0.1");
		DatagramPacket dp=new DatagramPacket(s.getBytes(),s.length(),ip,3000);
		ds.send(dp);
		ds.close();
	}
}