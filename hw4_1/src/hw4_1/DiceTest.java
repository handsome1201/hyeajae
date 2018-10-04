package hw4_1;

import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;

class Dice {

	int dice_x;

	int dice_y;

	int colx;

	int coly;

	int colz;

	int num;

	public Dice(int dice_x, int dice_y, int num) {

		this.dice_x = dice_x;

		this.dice_y = dice_y;

		this.colz = colz;

		this.num = num;

	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(dice_x, dice_y, 100, 100);
		g.setColor(Color.BLACK);
		g.drawRect(dice_x, dice_y, 100, 100);
		if (this.num == 1) {
			g.fillOval(dice_x + 45, dice_y + 45, 10, 10);

		} else if (this.num == 2) {
			g.fillOval(dice_x + 20, dice_y + 20, 10, 10);
			g.fillOval(dice_x + 70, dice_y + 70, 10, 10);

		} else if (this.num == 3) {
			g.fillOval(dice_x + 20, dice_y + 20, 10, 10);
			g.fillOval(dice_x + 45, dice_y + 45, 10, 10);
			g.fillOval(dice_x + 70, dice_y + 70, 10, 10);

		} else if (this.num == 4) {
			g.fillOval(dice_x + 20, dice_y + 20, 10, 10);
			g.fillOval(dice_x + 20, dice_y + 70, 10, 10);
			g.fillOval(dice_x + 70, dice_y + 20, 10, 10);
			g.fillOval(dice_x + 70, dice_y + 70, 10, 10);

		} else if (this.num == 5) {
			g.fillOval(dice_x + 20, dice_y + 20, 10, 10);
			g.fillOval(dice_x + 20, dice_y + 70, 10, 10);
			g.fillOval(dice_x + 45, dice_y + 45, 10, 10);
			g.fillOval(dice_x + 70, dice_y + 20, 10, 10);
			g.fillOval(dice_x + 70, dice_y + 70, 10, 10);

		} else if (this.num == 6) {
			g.fillOval(dice_x + 20, dice_y + 20, 10, 10);
			g.fillOval(dice_x + 20, dice_y + 70, 10, 10);
			g.fillOval(dice_x + 70, dice_y + 20, 10, 10);
			g.fillOval(dice_x + 70, dice_y + 70, 10, 10);
			g.fillOval(dice_x + 70, dice_y + 45, 10, 10);
			g.fillOval(dice_x + 20, dice_y + 45, 10, 10);
		}
	}
}

class MyPanel extends JPanel {
	public void paint(Graphics g) {
		Graphics graph = (Graphics) g;
		paintComponent(graph);
		Dice d1 = new Dice((int) (Math.random() * 400) + 200, (int) (Math.random() * 300) + 150,
				(int) (Math.random() * 6) + 1);
		d1.paintComponent(graph);
		Dice d2 = new Dice((int) (Math.random() * 200) + 0, (int) (Math.random() * 150) + 0,
				(int) (Math.random() * 6) + 1);
		d2.paintComponent(graph);
	}
}

public class DiceTest extends JFrame {
	public DiceTest() {
		super();
		this.add(new MyPanel());
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("주사위 던지기 프로그램");
		setVisible(true);
	}

	public static void main(String[] args) {
		DiceTest dt = new DiceTest();

	}
}