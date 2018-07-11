package example;

public class example {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;

		while (num < 1001) {
			if (num % 2 == 0 && num % 7 == 0) {
				sum += num;
				System.out.println(sum);
			}
			num++;
					}
	}
}
