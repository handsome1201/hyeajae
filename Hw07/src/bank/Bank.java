package bank;

import java.util.Scanner;

public class Bank {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int balance=0;      // �ܾ� ���� ����.
      while(true) {      // �� ���α׷��� ���� ������ �ֱ� ������ ���� ����Ǿ�� ��.
         System.out.println("----------------------------");
         System.out.println("1.����   | 2.���  | 3.�ܰ�  | 4.����");
         System.out.println("----------------------------");
         System.out.print("���� > ");
         int select = sc.nextInt();
         
         if(select<1 || select>4) {   // 1~4 �̿��� ���� ���� ���� ��쿡 ���� ����ó��.
            System.out.println("�߸��� �Է��Դϴ�.");
            continue; 
         }
         else if(select==1) {      // ���� ��Ȳ.
            while(true) {
               System.out.print("���ݾ� > ");
               int deposit = sc.nextInt();
               
               if(deposit < 0) {   // �Աݾ��� ������ ��쿡 ���� ����ó��.
                  System.out.println("�ݾ��� �߸� �ԷµǾ����ϴ�. (���� �Է�)\n �ٽ� �Է��� �ּ���.");
                  continue;
               }
               else {            // ���� �Ա�.
                  balance += deposit;
                  break;
               }
            }
         }
         else if(select==2) {      // ��� ��Ȳ.
            while(true) {
               System.out.print("��ݾ� > ");
               int withdraw = sc.nextInt();
               
               if(withdraw < 0) {   // ��ݾ��� ������ ��쿡 ���� ����ó��.
                  System.out.println("�ݾ��� �߸� �ԷµǾ����ϴ�. (���� �Է�)\n �ٽ� �Է��� �ּ���.");
                  continue;
               }
               else if(balance < withdraw) {   // ��ݾ��� �ܾ׺��� ���� ��쿡 ���� ����ó��.
                  System.out.println("�ܰ� �����մϴ�.\n �ٽ� �Է��� �ּ���.");
                  continue;
               }
               else {            // ���� ���.
                  balance -= withdraw;
                  break;
               }
            }
         }
         else if(select==3) {      // �ܾ� Ȯ�� ��Ȳ.
            System.out.println("�ܰ� > "+balance);
         }
         else {      // �ڵ� �� ���� ��Ȳ�� select == 4 �� ��� ���̴� ���� ���ǽ��� �Է� �� �� �ʿ䰡 ����.
            break;
         }
      }
   }
}