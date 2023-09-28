import javax.swing.*;
import java.awt.*;
class EX3{
	EX3(){
		JFrame f=new JFrame("CheckBox Example");
		JCheckBox c1=new JCheckBox("c++");
		c1.setBounds(100,100,50,50);
		JCheckBox c2=new JCheckBox("Java",true);
		c2.setBounds(100,150,50,50);
		f.add(c1);
		f.add(c2);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new EX3();
	}
}
		