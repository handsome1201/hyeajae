package project;

import java.util.Scanner;
/*
 * ������� �ظ��� �������� ���̸� �Է¹޾� ������� ���Ǹ� ���ϴ� ���α׷�
 */

public class project 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double radius,height,PI,volume;
		PI=Math.PI;
		   
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�.");
	    radius=input.nextDouble();
	
	    System.out.print("������� ���̸� �Է��Ͻÿ�.");
		height=input.nextDouble();
	    
		volume=(radius*radius)*PI*height;
			
	    System.out.print("������� ���Ǵ� "+volume+"�Դϴ�.");
	}
}
