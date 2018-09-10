package hw02;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("호텔 예약 에플리케이션");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		Panel pane1 = new Panel();

		JLabel label = new JLabel("자바 호텔에 오신것을 환영합니다.숙박인원을 선택하세요.");

		add(label);

		setVisible(true);

		Panel panel = new Panel();
		JButton b1 = new JButton();
		b1.setText("1명");
		JButton b2 = new JButton("2명");
		JButton b3 = new JButton("3명");
		JButton b4 = new JButton("4명");
		JButton b5 = new JButton("5명");

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
