package button;
import javax.swing.*;
import java.awt.*;

public class Mile1 extends JFrame{
	public Mile1() {
		setTitle("������ ų�ι��ͷ� ��ȯ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel= new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(firstLine());
		panel.add(secondLine());
		panel.add(thirdLine());
		add(panel);
		pack();
		setVisible(true);
		}
	
		private static JPanel firstLine() {
			Label label=new Label("�Ÿ��� ���� ������ �Է��Ͻÿ�");
			JTextField t = new JTextField(10);
			t.setText("1");
			t.setHorizontalAlignment(JTextField.RIGHT);
			JPanel p = new JPanel();
			p.add(label);
			p.add(t);
			return p; 
		}
		private static JPanel secondLine() {
			JPanel p = new JPanel();
			Button b1 = new Button("��ȯ");
			b1.setPreferredSize(new Dimension(30,30));
			p.add(b1);
			return p;
		}
		private static JPanel thirdLine() {
			JTextField t = new JTextField("1������ 1.6ų�ι����Դϴ�.");
			t.setHorizontalAlignment(JTextField.CENTER);
			t.setPreferredSize(new Dimension(200,20));
			JPanel p = new JPanel();
			p.add(t);
			return p;
		}
		public static void main(String arg[]) {
			Mile1 mile1 = new Mile1();
		}
		
}
	
