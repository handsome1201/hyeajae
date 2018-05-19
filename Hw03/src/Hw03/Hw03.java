package Hw03;

import java.util.Scanner;

import java.math.*;

public class Hw03 {
 public static void main(String args[])
 {
  double radius;
  double vol;
  
	
  Scanner input = new Scanner(System.in);
  System.out.print("반지름을 입력하세요: ");
  radius = input.nextDouble();
  
 vol =(radius*radius*radius) * (4.0/3.0) * Math.PI;
  System.out.println("구의 부피는 " + vol);
 }
}