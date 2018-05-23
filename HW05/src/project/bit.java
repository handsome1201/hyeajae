package project;

public class bit {

	public static void main(String[] args) {
		 int a=15678, b=1, c, d;
		  c=(a>>2)&b;
		  System.out.println("세번째 비트:"+c);

		  d=(a>>4)&b;
		  System.out.println("다섯번째 비트:"+d);

	}

}
