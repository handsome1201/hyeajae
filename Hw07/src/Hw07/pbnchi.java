package Hw07;
import java.util.Scanner;
public class pbnchi  {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int fibonacci=0;
         System.out.print("몇번째 항까지 출력하시겠습니까?(3이상 입력)");
         int num=sc.nextInt();
         int a=-1;
         int b=1;
         int c = 0;
         while(true){
            if(num<3) {
               System.out.println("3 이상의 수를 입력해 주세요.");
               System.out.print("몇번째 항까지 출력하시겠습니까?(3이상 입력)");
               num=sc.nextInt();
               continue;
            }
            else if(num>=3){
                for(int i=1;i<=num;i++) {
                     c=a+b;                     
                     a=b;
                       b=c;
                     System.out.print(c+" ");
               }      
            break;
            }
         }   
      }
}