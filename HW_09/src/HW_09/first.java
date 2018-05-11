package HW_09;


class Bank {

   private int balance;

   public void deposit(int amount) {
      if (amount <= 0) {
         System.out.println("잘못 입력");
      } else {
         balance = amount;

      }
   }

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