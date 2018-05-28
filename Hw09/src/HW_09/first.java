package HW_09;
//은행 계좌 프로그램
class Bank {

 //모든 필드 private 선언
   private int balance;
 //입금 금액이 음수이면, 에러 메시지를 출력
   public void deposit(int amount) {
      if (amount <= 0) {
         System.out.println("잘못 입력");
      } else {
         balance = amount;

      }
   }
//출금 금액이 음수이거나 현재 잔액보다 더 많은 액수를 인출하려고 할 때 에러 메시지를 출력
   public void withdraw(int amount) {
      if (amount <= 0) {
         System.out.println("잘못 입력");

      } else {
         if (balance < amount) {
            System.out.println("잔액부족");

         } else {
            balance = balance - amount;

         }
      }
   }
//송금하려는 액수가 해당 계좌의 잔액을 초과하거나 음수일 경우 에러 메시지를 출력
   public int transfer(int amount, Bank otherAccount) {
      if (amount > balance) {
         System.out.println("잔액부족");
      } else {
         balance = balance - amount;
         otherAccount.balance += amount;
         return balance;
      }
      return balance;
   }

   public int getbalance() {
      return balance;
   }
}

public class first {

   public static void main(String[] args) {

      Bank tonyaccount = new Bank();
      Bank steveaccount = new Bank();

      tonyaccount.deposit(-2000);
      tonyaccount.deposit(10000);
      tonyaccount.withdraw(-2000);

      steveaccount.deposit(500);
      steveaccount.withdraw(2000);

      tonyaccount.transfer(20000, steveaccount);

      System.out.println("토니 의 잔액 : " + tonyaccount.getbalance());
      System.out.println("스티브 의 잔액 : " + steveaccount.getbalance());
   }
}