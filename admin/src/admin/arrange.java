package admin;

import java.util.Scanner;

public class arrange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int put=0;
		int[] num = new int[5];
		int total = 0;
		double average = 0;

		for (int j = 0; j < num.length; j++) {
			System.out.print("������ �Է��Ͻÿ�: ");
			put = scanner.nextInt();
			num[j]=put;
		}	
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		average = total/num.length;

		System.out.println("������ �հ�� " + total + " �Դϴ�");
		System.out.println("������ ����� " + average + " �Դϴ�");
	}
}