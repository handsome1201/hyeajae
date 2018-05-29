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
			System.out.print("정수를 입력하시오: ");
			put = scanner.nextInt();
			num[j]=put;
		}	
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		average = total/num.length;

		System.out.println("원소의 합계는 " + total + " 입니다");
		System.out.println("원소의 평균은 " + average + " 입니다");
	}
}