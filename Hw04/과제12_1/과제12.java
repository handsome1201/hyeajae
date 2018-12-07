package chess;

import java.util.Scanner;

public class 과제12 {
   //재귀가 반복문보다 일정수자 이하에서는 빠르지만 그 이후에는 반목문이 더 빠르다. 그 이유는 반복문은 n번 돌아가서
   //숫자가 커져도 시간복잡도의 속도 변화가 크지 않지만 재귀의 경우 숫자가 커질수록 시간 복잡도의 속도 변화가 더 크기 떄문.
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      long start=System.currentTimeMillis();
      System.out.println(loopFibonacci(n));
      long end=System.currentTimeMillis();
      System.out.println("loopFibonacci: "+(end-start)/10000.0+"초");
      start=System.currentTimeMillis();
      System.out.println(recursiveFibonacci(n));
      end=System.currentTimeMillis();
      System.out.println("recursiveFibonacci: "+(end-start)/10000.0+"초");

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