import java.awt.*;
import javax.swing.*;
public class Samp {
	public static void main(String[] args){
	JFrame f=new JFrame("To check Closing");
	Button b=new Button();
	f.setLayout(new FlowLayout());
	f.add(b);
	f.setSize(400,500);
	f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	f.setVisible(true);
	}
}
