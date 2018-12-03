package url;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class html {
	JButton b;
	JTextField t;
	JEditorPane scroll1;
	JEditorPane scroll2;

	public html() {
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout(4,4));
		t = new JTextField(25);
		b = new JButton("HTML 가져오기");
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		JLabel l = new JLabel();
		JLabel url = new JLabel("URL: ");
		scroll1 = new JEditorPane();
		scroll2 = new JEditorPane();
		scroll1.setContentType("text/plain");
		scroll2.setContentType("text/html");
		scroll1.setEditable(false);
		scroll2.setEditable(false);
		p.setLayout(new GridLayout(2, 1));
		p.add(new JScrollPane(scroll1));
		p.add(new JScrollPane(scroll2));
		p2.add(url);
		p2.add(t);
		b.addActionListener(new MyListener());
		p2.add(b);
		frame.add(p, BorderLayout.CENTER);
		frame.add(p2, BorderLayout.SOUTH);
		frame.setTitle("HTML 보기");
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

	private class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b) {
				String data = t.getText();
				try {
					URL u = new URL(data);
					URLConnection urlConnection;
					urlConnection = u.openConnection();
					BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
					String inLine;
					String result= "";
					while ((inLine = in.readLine()) != null) {
						result+=inLine;
					}
					scroll1.setText(result);
					scroll2.setText(result);
					in.close();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
			}
		}
	}
}
