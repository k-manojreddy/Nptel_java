import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EX1 implements ActionListener{
	static JLabel l;
	EX1(JButton b,JButton b1){
		b.addActionListener(this);
		b1.addActionListener(this);
	}
	public static void main(String[] args){
		JFrame f=new JFrame("JFrame Example");
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout());
		 l=new JLabel("Example");
		JButton b=new JButton();
		JButton b1=new JButton("Reset");
		b.setText("Button");
		p.add(l);p.add(b);p.add(b1);
		f.add(p);
		f.setSize(600,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		new EX1(b,b1);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		if(s.equals("Button"))
		l.setText("Button Clicked");
		
	else
		l.setText("Example");
	}
}