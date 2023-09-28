import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EX4 implements ActionListener{
	JTextField l;
	JFrame f;
	JComboBox c;
	String s[]={"UHV","CO","DM","BEE","SS","AEC","OOPJ","CVV"};
	EX4(){
	l=new JTextField(15);
	f=new JFrame("Combo Box Example");
	c=new JComboBox(s);
	l.setBounds(100, 150, 100, 20);
	c.setBounds(0,0,75,75);
	c.addActionListener(this);
	f.add(c);f.add(l);f.setLayout(null);
	f.setSize(400,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	}
	public static void main(String[] args){
		new EX4();
	}
	public void actionPerformed(ActionEvent e){
		String h=(String)c.getSelectedItem();
		if(h.equals(s[4]))
			l.setText("9.90");
		else
			l.setText("10.0");
		//f.add(l);
		f.repaint();
	}
}
	