package project;

import java.util.Scanner;
/*
 * 원기둥의 밑면의 반지름과 높이를 입력받아 원기둥의 부피를 구하는 프로그램
 */

public class project 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double radius,height,PI,volume;
		PI=Math.PI;
		   
		System.out.print("원기둥 밑면의 반지름을 입력하시오.");
	    radius=input.nextDouble();
	
	    System.out.print("원기둥의 높이를 입력하시오.");
		height=input.nextDouble();
	    
		volume=(radius*radius)*PI*height;
			
	    System.out.print("원기둥의 부피는 "+volume+"입니다.");
	}
}
