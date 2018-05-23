package project;

import java.util.Scanner;

//윤년을 계산하는 프로그램
public class work2 {

	public static void main(String[] args) {
		
		int year;
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("연도를 입력하시오 :");//연도를 입력
		year = input.nextInt();
		
		System.out.print(year+"년은 윤년인가?:"+(((year%4)==0 && (year%100)!=0) || (year%400)==0));

	}

}
