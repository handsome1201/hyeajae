package admin;

import java.util.Scanner;

public class max_min {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int put = 0;
		int[] num = new int[5];
		int max;
		int min;
		
		for (int i = 0; i <num.length; i++) {	
			System.out.print("������ �Է��Ͻÿ�: ");
			put = scanner.nextInt();
			num[i]= put;
		}
		max = num[0];
		min = num[0];
		for (int i = 0; i <num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
			}
		}
	System.out.println("������ �ִ��� " + max + " �Դϴ�");
	System.out.println("������ �ּڰ��� " + min + " �Դϴ�");

	}
}
