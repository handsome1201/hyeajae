package hw02;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("ȣ�� ���� ���ø����̼�");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		Panel pane1 = new Panel();

		JLabel label = new JLabel("�ڹ� ȣ�ڿ� ���Ű��� ȯ���մϴ�.�����ο��� �����ϼ���.");

		add(label);

		setVisible(true);

		Panel panel = new Panel();
		JButton b1 = new JButton();
		b1.setText("1��");
		JButton b2 = new JButton("2��");
		JButton b3 = new JButton("3��");
		JButton b4 = new JButton("4��");
		JButton b5 = new JButton("5��");

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		add(panel);
		setVisible(true);

	}
}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();

	}
}
