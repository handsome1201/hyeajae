package example;

public class example {

	public static void main(String[] args) {
		System.out.println(round(3));
		System.out.println(wield(3));
	}

	public static double round(double rad) {
		final double PI = 3.14;
		return rad * rad * PI;
	}

	public static double wield(double rad) {
		final double PI = 3.14;
		return rad * 2 * PI;
	}
}
