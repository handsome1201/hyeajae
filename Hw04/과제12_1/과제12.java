package chess;

import java.util.Scanner;

public class ����12 {
   //��Ͱ� �ݺ������� �������� ���Ͽ����� �������� �� ���Ŀ��� �ݸ��� �� ������. �� ������ �ݺ����� n�� ���ư���
   //���ڰ� Ŀ���� �ð����⵵�� �ӵ� ��ȭ�� ũ�� ������ ����� ��� ���ڰ� Ŀ������ �ð� ���⵵�� �ӵ� ��ȭ�� �� ũ�� ����.
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      long start=System.currentTimeMillis();
      System.out.println(loopFibonacci(n));
      long end=System.currentTimeMillis();
      System.out.println("loopFibonacci: "+(end-start)/10000.0+"��");
      start=System.currentTimeMillis();
      System.out.println(recursiveFibonacci(n));
      end=System.currentTimeMillis();
      System.out.println("recursiveFibonacci: "+(end-start)/10000.0+"��");

   }
   
   public static int loopFibonacci(int n) {
      int a[]=new int[1000];
      a[0]=0; a[1]=1;
      for(int i=2;i<=n;i++) {
         a[i]=a[i-1]+a[i-2];
      }
      return a[n];
   }
   public static int recursiveFibonacci(int n) {
      if(n==0) return 0;
      else if(n==1) return 1;
      else {
         return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
      }
   }
}