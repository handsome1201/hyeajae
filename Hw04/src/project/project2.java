package project;

import java.util.Scanner;
/*
 *������ ������ �Է¹޾� �� ���� �հ踦 ���ϴ� ���α׷�
 */

public class project2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int won500,won100,won50,won10;//������ ������ �Ǽ��� �ɼ�����.
		
		int total;//���� ���հ�� �Ǽ��� �ɼ�����.
	
		System.out.print("500���ǰ�����?");
		won500=input.nextInt();
		
		System.out.print("100���ǰ�����?");
		won100=input.nextInt();
		
		System.out.print("50���ǰ�����?");
		won50=input.nextInt();
		
		System.out.print("10���ǰ�����?");
		won10=input.nextInt();
	
	    total=(won500*500+won100*100+won50*50+won10*10);
	    
	    System.out.print("�� �׼��� "+total+"���Դϴ�.");
	}

}
