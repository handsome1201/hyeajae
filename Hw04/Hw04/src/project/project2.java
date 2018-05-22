package project;

import java.util.Scanner;
/*
 *동전의 갯수를 입력받아 총 돈의 합계를 구하는 프로그램
 */

public class project2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int won500,won100,won50,won10;//동전의 갯수는 실수가 될수없다.
		
		int total;//돈의 총합계는 실수가 될수없다.
	
		System.out.print("500원의갯수는?");
		won500=input.nextInt();
		
		System.out.print("100원의갯수는?");
		won100=input.nextInt();
		
		System.out.print("50원의갯수는?");
		won50=input.nextInt();
		
		System.out.print("10원의갯수는?");
		won10=input.nextInt();
	
	    total=(won500*500+won100*100+won50*50+won10*10);
	    
	    System.out.print("총 액수는 "+total+"원입니다.");
	}

}
