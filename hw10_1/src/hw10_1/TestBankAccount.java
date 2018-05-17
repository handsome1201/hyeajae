package hw10_1;

import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String owner;
		String accountnumber;
		int balance;
		int amount;
		
		System.out.println("첫번째 고객의 정보를 입력하시오.");
		System.out.print("예금주: ");
		owner = scanner.next();
		System.out.print("계좌번호: ");
		accountnumber = scanner.next();
		System.out.print("초기금액: ");
		balance = scanner.nextInt();
		
		BankAccount my_acct = new BankAccount(owner, accountnumber, balance);
		
		System.out.println("두번째 고객의 정보를 입력하시오.");
		System.out.print("예금주: ");
		owner = scanner.next();
		System.out.print("계좌번호: ");
		accountnumber = scanner.next();
		System.out.print("초기금액: ");
		balance = scanner.nextInt();
		
		BankAccount your_acct = new BankAccount(owner, accountnumber, balance);
		
		System.out.print("첫 번째 계좌에서 두 번쨰 계좌로 송금할 금액: ");
		amount = scanner.nextInt();
		
		my_acct.transfer(amount, your_acct);
		
		System.out.println("첫 번째 계좌의 정보: "+ my_acct.toString());
		System.out.println("두 번째 계좌의 정보: " + your_acct.toString());
	}

}
