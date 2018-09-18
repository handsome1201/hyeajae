package hw;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	public MyFrame() {

		setTitle("BoxLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		makeButton(panel, "Buttton1");
		makeButton(panel, "B2");
		makeButton(panel, "¹öÆ°");
		makeButton(panel, "Long Buttton");
		makeButton(panel, "Buttton5");
		add(panel);
		pack();
		setVisible(true);
	}

	private void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(button);
	}
}

public class hw1 {
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}
}
