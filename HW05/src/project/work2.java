package project;

import java.util.Scanner;

//������ ����ϴ� ���α׷�
public class work2 {

	public static void main(String[] args) {
		
		int year;
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("������ �Է��Ͻÿ� :");//������ �Է�
		year = input.nextInt();
		
		System.out.print(year+"���� �����ΰ�?:"+(((year%4)==0 && (year%100)!=0) || (year%400)==0));

	}

}
