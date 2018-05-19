package Hw03_1;

import java.util.Scanner;

import java.math.*;

public class Hw03_1 {
 public static void main(String args[])
 {
 
  Scanner sc = new Scanner(System.in);
  double fdg = 0;
  
  System.out.print("화씨 온도를 입력하세요 : ");
  fdg = sc.nextDouble();
  
  double cdg;
  cdg = (fdg - 32)*5/9;
 
  System.out.println("섭씨온도는" + cdg + "입니다."); 
 }
}