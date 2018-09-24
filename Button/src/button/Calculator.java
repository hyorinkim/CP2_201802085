package button;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
	public Calculator() {
		setTitle("°è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(firstLine());
		p.add(secondLine());
		p.add(thirdLine());
		add(p);
		pack();
		setVisible(true);
	}
	
	private static JPanel firstLine() {
		JTextField t = new JTextField(23);
		t.setText("23");
		t.setHorizontalAlignment(JTextField.RIGHT);
		JPanel p = new JPanel();
		p.add(t);
		return p;
	}
	private static JPanel secondLine() {
	Button b= new Button("c");
	JPanel p = new JPanel();
	p.setLayout(new GridLayout(0,4,10,10));
	b.setPreferredSize(new Dimension(30,30));
	
	p.add(b);
	return p;
	}
	private static JPanel thirdLine() {
		JPanel p= new JPanel();
		p.setLayout(new GridLayout(0,4,10,10));
		makeButton(p, "7");
		makeButton(p,"8");
		makeButton(p,"9");
		makeButton(p,"/");
		makeButton(p,"4");
		makeButton(p,"5");
		makeButton(p,"6");
		makeButton(p,"*");
		makeButton(p,"1");
		makeButton(p,"2");
		makeButton(p,"3");
		makeButton(p,"-");
		makeButton(p,"0");
		makeButton(p,"00");
		makeButton(p,"=");
		makeButton(p,"+");
		return p;
	}
	private static void makeButton (JPanel p,String n) {
		Button b = new Button(n);
		p.add(b);
	}
	public static void main(String arg[]) {
		Calculator c= new Calculator();
	}
}
