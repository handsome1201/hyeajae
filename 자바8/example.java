package example;

public class example {

	public static void main(String[] args) {
		num(7, 5);
		num(3, 8);
	}

	public static void num(int num1, int num2) {
		if (num1 >= num2) {
			System.out.println(num1 - num2);
		} else
			System.out.println(-(num1 - num2));
	}
}
