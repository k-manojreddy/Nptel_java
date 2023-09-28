import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class EX2{
	public static void main(String[] args){
		JFrame f=new JFrame("Panel Example");
		JPanel p=new JPanel();
		p.setBounds(80,80,200,200);
		p.setBackground(Color.gray);
		//p.setLayout(new FlowLayout());
		//JLabel l=new JLabel("Example");
		JButton b1=new JButton();
		b1.setText("Button 1");
		b1.setBounds(50,100,80,30);
		b1.setBackground(Color.yellow);
		JButton b2=new JButton();
		b2.setText("Button 2");
		b2.setBounds(100,100,80,30);
		b2.setBackground(Color.green);
		//p.add(l);
		p.add(b1);p.add(b2);
		f.add(p);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}