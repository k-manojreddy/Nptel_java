import java.applet.*;
import java.awt.*;
/*<applet code="EX40" width=300 height=300></applet>*/
public class EX40 extends Applet implements Runnable{
	String s="This is a simple Banner ";
	Thread t=null;
	boolean k;
	public void init(){
		setBackground(Color.green);
		setForeground(Color.red);
	}
	public void start(){
		t=new Thread(this);
		k=false;
		t.start();
	}
	public void run(){
		for(;;){
			try{
				repaint();
				t.sleep(250);
				char c=s.charAt(0);
				s=s.substring(1,s.length());
				s+=c;
				if(k){
					break;
				}
			}
			catch(Exception e){
			}
		}
	}
	public void stop(){
		k=true;
		t=null;
	}
	public void paint(Graphics g){
		g.drawString(s,100,100);
	}
}
				