package Hw07;
import java.util.Scanner;
public class pbnchi  {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int fibonacci=0;
         System.out.print("���° �ױ��� ����Ͻðڽ��ϱ�?(3�̻� �Է�)");
         int num=sc.nextInt();
         int a=-1;
         int b=1;
         int c = 0;
         while(true){
            if(num<3) {
               System.out.println("3 �̻��� ���� �Է��� �ּ���.");
               System.out.print("���° �ױ��� ����Ͻðڽ��ϱ�?(3�̻� �Է�)");
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