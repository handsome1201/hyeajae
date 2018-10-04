package hw4;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

class Circle {

	int color_R;

	int color_G;

	int color_B;

	int radius;

	int circle_x;

	int circle_y;

	Circle(int color_R, int color_G, int color_B, int radius, int circle_x, int circle_y) {

		this.color_R = color_R;

		this.color_G = color_G;

		this.color_B = color_B;

		this.radius = radius;

		this.circle_x = circle_x;

		this.circle_y = circle_y;

	}

		public void paintComponent(Graphics g) {

			Color color = new Color(this.color_R, this.color_G, this.color_B);

			g.setColor(color);

			g.fillOval(this.circle_x, this.circle_y, this.radius * 2, this.radius * 2);

		}

	}

	class Mypanel3 extends JPanel {

		public void paint(Graphics g) {

			Graphics graph = (Graphics) g;

			paintComponent(graph);

			Circle[] circle = new Circle[10];

			for (int i = 0; i < 10; i++) {

				circle[i] = new Circle((int) (Math.random() * 255), (int) (Math.random() * 255),
						(int) (Math.random() * 255),

						(int) (Math.random() * 100), (int) (Math.random() * 700), (int) (Math.random() * 500));

				circle[i].paintComponent(graph);

			}

		}

	}

	class MyFrame3 extends JFrame {

		MyFrame3() {

			this.add(new Mypanel3());

			setSize(1000, 700);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			setTitle("¹®Á¦3");

			setVisible(true);

		}
	}

public class test3 {

	public static void main(String[] args) {

		MyFrame3 f = new MyFrame3();

	}

}
