package Hw03_1;

import java.util.Scanner;

import java.math.*;

public class Hw03_1 {
 public static void main(String args[])
 {
 
  Scanner sc = new Scanner(System.in);
  double fdg = 0;
  
  System.out.print("ȭ�� �µ��� �Է��ϼ��� : ");
  fdg = sc.nextDouble();
  
  double cdg;
  cdg = (fdg - 32)*5/9;
 
  System.out.println("�����µ���" + cdg + "�Դϴ�."); 
 }
}