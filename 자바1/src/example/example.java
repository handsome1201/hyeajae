package example;

public class example {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if ((i == 2) && (j == 3))
					break;
				else if ((i == 4) && (j == 5))
					break;
				else if ((i == 6) && (j == 7))
					break;
				else if ((i == 8) && (j == 9))
					break;
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}
}