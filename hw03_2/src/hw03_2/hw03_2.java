package hw03_2;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	private JPanel panel, panel1, panel2, panel3;
	private JTextField outputTextField;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17;

	public MyFrame() {
		setTitle("°è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));

		panel = new JPanel();
		outputTextField = new JTextField(30);

		panel1 = new JPanel(new GridLayout(0, 4, 5, 5));
		b4 = new JButton("c");
		panel1.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 5));

		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4, 4, 5, 5));

		b1 = new JButton("7");
		b2 = new JButton("8");
		b3 = new JButton("9");
		b5 = new JButton("/");
		b6 = new JButton("4");
		b7 = new JButton("5");
		b8 = new JButton("6");
		b9 = new JButton("*");
		b10 = new JButton("1");
		b11 = new JButton("2");
		b12 = new JButton("3");
		b13 = new JButton("-");
		b14 = new JButton("0");
		b15 = new JButton("back");
		b16 = new JButton("=");
		b17 = new JButton("+");

		panel3.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		panel3.add(panel);
		panel3.add(panel1);
		panel.add(outputTextField);
		panel3.add(panel2);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b5);
		panel2.add(b6);
		panel2.add(b7);
		panel2.add(b8);
		panel2.add(b9);
		panel2.add(b10);
		panel2.add(b11);
		panel2.add(b12);
		panel2.add(b13);
		panel2.add(b14);
		panel2.add(b15);
		panel2.add(b16);
		panel2.add(b17);
		panel1.add(b4);
		add(panel3);

		pack();

		setVisible(true);
	}
}

public class hw03_2 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
