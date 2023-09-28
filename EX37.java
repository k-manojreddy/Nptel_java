import java.awt.*;
import java.applet.*;
/*<applet code="EX37" width=500 height=500 ></applet>*/
public class EX37 extends Applet{
	String msg="";
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg+="Inside Init()--";
	}
	public void start(){
		msg+="Inside Start()--";
	}
	public void paint(Graphics g){
		msg+="Inside paint()--";
		g.drawString(msg,0,50);
	}
}