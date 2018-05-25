package bank;

import java.util.Scanner;

public class Bank {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int balance=0;      // 잔액 변수 선언.
      while(true) {      // 본 프로그램은 집적 종료해 주기 전까지 무한 실행되어야 함.
         System.out.println("----------------------------");
         System.out.println("1.예금   | 2.출금  | 3.잔고  | 4.종료");
         System.out.println("----------------------------");
         System.out.print("선택 > ");
         int select = sc.nextInt();
         
         if(select<1 || select>4) {   // 1~4 이외의 수를 선택 했을 경우에 대한 예외처리.
            System.out.println("잘못된 입력입니다.");
            continue; 
         }
         else if(select==1) {      // 예금 상황.
            while(true) {
               System.out.print("예금액 > ");
               int deposit = sc.nextInt();
               
               if(deposit < 0) {   // 입금액이 음수일 경우에 대한 예외처리.
                  System.out.println("금액이 잘못 입력되었습니다. (음수 입력)\n 다시 입력해 주세요.");
                  continue;
               }
               else {            // 정상 입금.
                  balance += deposit;
                  break;
               }
            }
         }
         else if(select==2) {      // 출금 상황.
            while(true) {
               System.out.print("출금액 > ");
               int withdraw = sc.nextInt();
               
               if(withdraw < 0) {   // 출금액이 음수일 경우에 대한 예외처리.
                  System.out.println("금액이 잘못 입력되었습니다. (음수 입력)\n 다시 입력해 주세요.");
                  continue;
               }
               else if(balance < withdraw) {   // 출금액이 잔액보다 많을 경우에 대한 예외처리.
                  System.out.println("잔고가 부족합니다.\n 다시 입력해 주세요.");
                  continue;
               }
               else {            // 정상 출금.
                  balance -= withdraw;
                  break;
               }
            }
         }
         else if(select==3) {      // 잔액 확인 상황.
            System.out.println("잔고 > "+balance);
         }
         else {      // 코드 상 남은 상황은 select == 4 일 경우 뿐이니 굳이 조건식을 입력 해 줄 필요가 없다.
            break;
         }
      }
   }
}