package admin2;

import java.util.Scanner;

public class admin3 {

	public static void main(String[] args) {

		int count[] = new int[200];
		char array[] = { 'a', 'b', 'c', 'a' };

		for (int i = 0; i < array.length; i++) {
			count[array[i]]++;
			if (count[array[i]] >= 2)
				System.out.println("false");
			else
				System.out.println("true");
		}
	}

}
