import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {//implements ActionListener {
	public Login(){
	Container c = getContentPane();
	JPanel p = new JPanel();
	p.setLayout(null);
	JButton b = new JButton("Sign in");
	b.setBounds(100,250,72,20);
	p.add(b);
	//b.addActionListener(this);
	JButton b1 = new JButton("Register");
	b1.setBounds(225,250,83,20);
	p.add(b1);
	JTextArea t = new JTextArea();
	t.setBounds(208,155,100,15);
	p.add(t);
	JTextArea t1 = new JTextArea();
	t1.setBounds(208,205,100,15);
	p.add(t1);
	JLabel l = new JLabel("Login :");
	l.setBounds(100, 100, 180, 125);
	p.add(l);
	JLabel l1 = new JLabel("Password :");
	l1.setBounds(100, 150, 180, 125);
	p.add(l1);
	c.add(p);
	setSize(500,500);
	setVisible(true);
	}
	public static void main(String args[]){
		Login g =new Login();
	}
}
