package admin2;

public class admin {

	public static void main(String[] args) {
		int array[] = { 4, 1, 3, 2 ,3};
		int count[] = { 0, 0, 0, 0 ,0 ,0};
		

		for (int i = 0; i < array.length; i++) {
			count[array[i]]++;
			if (count[array[i]] >= 2)
				System.out.println("false");
			else
				System.out.println("true");
		}
	}
}