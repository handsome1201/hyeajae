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
			System.out.print("정수를 입력하시오: ");
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
	System.out.println("원소의 최댓값은 " + max + " 입니다");
	System.out.println("원소의 최솟값은 " + min + " 입니다");

	}
}
