package hw_03;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("이자계산기");
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		JLabel label1 = new JLabel("원금을 입력하시오.");
		JLabel label2 = new JLabel("이율을 입력하시오.");

		JTextField text1 = new JTextField(40);
		JTextField text2 = new JTextField(40);
		JButton button = new JButton("변환");
		JTextField text3 = new JTextField("");

		panel.add(label1);
		label1.setBounds(10, 10, 190, 20);

		panel.add(label2);
		label2.setBounds(10, 30, 190, 20);

		panel.add(text1);
		text1.setBounds(150, 10, 40, 20);

		panel.add(text2);
		text2.setBounds(150, 30, 40, 20);

		panel.add(button);
		button.setBounds(100, 60, 60, 30);

		panel.add(text3);
		text3.setBounds(50, 100, 150, 20);

		add(panel);

		setVisible(true);

	}

	private void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(button);
	}
}

public class hw03 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
