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
		
		System.out.println("ù��° ���� ������ �Է��Ͻÿ�.");
		System.out.print("������: ");
		owner = scanner.next();
		System.out.print("���¹�ȣ: ");
		accountnumber = scanner.next();
		System.out.print("�ʱ�ݾ�: ");
		balance = scanner.nextInt();
		
		BankAccount my_acct = new BankAccount(owner, accountnumber, balance);
		
		System.out.println("�ι�° ���� ������ �Է��Ͻÿ�.");
		System.out.print("������: ");
		owner = scanner.next();
		System.out.print("���¹�ȣ: ");
		accountnumber = scanner.next();
		System.out.print("�ʱ�ݾ�: ");
		balance = scanner.nextInt();
		
		BankAccount your_acct = new BankAccount(owner, accountnumber, balance);
		
		System.out.print("ù ��° ���¿��� �� ���� ���·� �۱��� �ݾ�: ");
		amount = scanner.nextInt();
		
		my_acct.transfer(amount, your_acct);
		
		System.out.println("ù ��° ������ ����: "+ my_acct.toString());
		System.out.println("�� ��° ������ ����: " + your_acct.toString());
	}

}
