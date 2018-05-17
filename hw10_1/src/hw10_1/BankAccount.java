package hw10_1;

public class BankAccount {

	private String owner;
	private String accountNumber;
	private int balance;

	public BankAccount(String o, String a, int b) {
		owner = o;
		accountNumber = a;
		balance = b;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String b = String.format("%,d", balance);
		String p = owner + ", " + accountNumber + ", " + "�ܾ�: " + b;
		return p;
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if(balance>=amount) {
			withdraw(amount);
			otherAccount.deposit(amount);
			System.out.println("�۱ݿϷ�");
			return true;
		}
		else {
			System.out.println("�ܾ׺���");
			return false;
		}
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}

}
