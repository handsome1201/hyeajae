package hw_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class ManLabel extends JLabel {
	ManLabel() {
		this.setText("@");
		this.setForeground(Color.red);
	}
}

class MonsterLabel extends JLabel {
	MonsterLabel() {
		this.setText("M");
	}
}

public class hw10 extends JFrame {
	ManLabel manLabel;
	MonsterLabel monsterLabel;

	int manX, manY;
	int monX, monY;
	int height, width;

	hw10() {
		setTitle("OpenChallenge");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		manX = this.getWidth() / 2;
		manY = this.getHeight() / 2;

		width = this.getWidth() - 30;
		height = this.getHeight() - 30;

		GamePanel gamePanel = new GamePanel();
		setContentPane(gamePanel);

		setVisible(true);
	}

	class GamePanel extends JPanel {
		Random random = new Random();

		GamePanel() {
			setLayout(null);

			monX = random.nextInt(height) / 10 * 10;
			monY = random.nextInt(width) / 10 * 10;

			manLabel = new ManLabel();
			manLabel.setBounds(manX, manY, 15, 15);
			this.addKeyListener(new ManKeyListener());

			monsterLabel = new MonsterLabel();
			monsterLabel.setBounds(monX, monY, 15, 15);

			MonsterThread monsterTh = new MonsterThread();

			add(manLabel);
			add(monsterLabel);

			this.setFocusable(true);
			this.grabFocus();

			monsterTh.start();
		}
	}

	class MonsterThread extends Thread {
		public void run() {
			while (true) {
				if (monX > manX) {
					monX -= 5;
					System.out.println("left");
				}
				if (monX < manX) {
					monX += 5;
					System.out.println("right");
				}
				if (monY > manY) {
					monY -= 5;
					System.out.println("up");
				}
				if (monY < manY) {
					monY += 5;
					System.out.println("down");
				}
				monsterLabel.setLocation(monX, monY);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					return;
				}
			}
		}
	}

	class ManKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_UP)
				manY -= 10;
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				manY += 10;
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				manX -= 10;
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				manX += 10;
			if (e.getKeyChar() == 'q')
				System.exit(0);
			manLabel.setLocation(manX, manY);
		}
	}

	public static void main(String[] args) {
		new OpenChallenge();
	}
}