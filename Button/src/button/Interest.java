package button;
import javax.swing.*;
import java.awt.*;

public class Interest extends JFrame{
	public Interest() {
	setTitle("���ڰ���");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel= new JPanel();
	panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	panel.add(firstLine());
	panel.add(secondLine());
	panel.add(thirdLine());
	panel.add(forthLine());
	add(panel);
	pack();
	setVisible(true);
	}
	private static JPanel firstLine() {
		Label label=new Label("������ �Է��Ͻÿ�");
		JTextField t = new JTextField(10);
		t.setText("1000");
		t.setHorizontalAlignment(JTextField.RIGHT);
		JPanel p = new JPanel();
		p.add(label);
		p.add(t);
		return p; 
	}
	private static JPanel secondLine() {
		JPanel p = new JPanel();
		Label label=new Label("������ �Է��Ͻÿ�.");
		JTextField t = new JTextField(10);
		t.setText("7.5");
		t.setHorizontalAlignment(JTextField.RIGHT);
		
		p.add(label);
		p.add(t);
		return p;
	}
	private static JPanel thirdLine() {
		Button b1 = new Button("��ȯ");
		b1.setPreferredSize(new Dimension(30,30));
		JPanel p = new JPanel();
		p.add(b1);
		return p;
	}
	private static JPanel forthLine() {
		
		JTextField t = new JTextField("���ڴ� �� 75���� �Դϴ�.");
		t.setHorizontalAlignment(JTextField.CENTER);
		t.setPreferredSize(new Dimension(200,20));
		JPanel p = new JPanel();
		p.add(t);
		return p;
	}
	
	public static void main(String arg[]) {
		Interest interest= new Interest();
	}

}
