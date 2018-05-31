package Hw12;

import java.util.*;

class BankAccount{
	protected int balance=0;
	public BankAccount(int balance){
		this.balance=balance;
	}
	void deposit(int amount) {
		if(amount<=0) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else
			balance = amount;
	}
	boolean withdraw(int amount) {
		if(balance-amount<0||amount<=0)
			return false;
		else
			balance=balance-amount;
			return true;		
	}
	
	boolean transfer(int amount, BankAccount otherAccount) {
		if (amount>balance) {
			System.out.println("잔액 부족");
			return false;
		}
		else {
			balance=balance-amount;
			otherAccount.balance+=amount;
			System.out.println("송금 완료");
			return true;
		}
	}
	public int getBalance() {
		return balance;
	}
	public String toString() {
		return "잔액: "+getBalance();
	}
}
class SavingsAccount extends BankAccount{
	private double interestRate;
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate=interestRate;
	}
	public void updateBalance(int period) {
		balance=(int) ((balance*interestRate*period)+balance);
	}
}
class CheckingAccount extends BankAccount {
	SavingsAccount protectedBy;
	CheckingAccount(int balance){
		super(balance);
	}
	CheckingAccount(int balance,SavingsAccount psa){
		super(balance);
		protectedBy=psa;
	}
	boolean withdraw(int amount) {
		if(amount<=0||(balance-amount<0&&protectedBy.balance<amount-balance))
			return false;
		else {
			if(balance>=amount) {
				balance=balance-amount;
			}
			else if ((balance-amount<0&&amount>0)&&protectedBy.balance>=amount-balance) {
				protectedBy.balance-=(amount-balance);
				balance=0;
			}
			
			return true;
		}
	}
}
class Customer{
	private String firstName;
	private String lastName;
	private int numberOfAccounts;
	BankAccount[] accounts;
	public Customer(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		accounts=new BankAccount[5];
		numberOfAccounts=0;
	}
	public void addAccount(BankAccount acc) {
		accounts[numberOfAccounts]=acc;
		numberOfAccounts+=1;
	}
	public BankAccount getAccount(int index) {
		return accounts[index-1];
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getNumOfAccounts() {
		return numberOfAccounts;
	}
	public void setBankAccount(BankAccount[] account) {
		this.accounts=account;
	}
	public BankAccount[] getBankAccount() {
		return accounts;
	}
	public String toString() {
		return "이름 : " + firstName + lastName + ", 계좌의 개수 : " + numberOfAccounts;
	}
}
class Bank{
	Customer[] customers;
	public static int numberOfCustomers;
	public Bank() {
		numberOfCustomers=0;
		customers=new Customer[10];
	}
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers]=customer;
		this.numberOfCustomers=numberOfCustomers+1;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer getCustomer(int index) {
		return customers[index-1];
	}
}
public class 과제12_1  {
	public static void main(String[] args) {
		Bank bank = new Bank();
	    Customer customer1 = new Customer("Tony","Stark");
	    SavingsAccount tonySacc = new SavingsAccount(2000 , 0.01);
	    CheckingAccount tonyCacc = new CheckingAccount(3000, tonySacc);
	    customer1.addAccount(tonySacc);
	    customer1.addAccount(tonyCacc);
	    
	    Customer customer2 = new Customer("Peter","Parker");
	    CheckingAccount peterCacc = new CheckingAccount(2000);
	    customer2.addAccount(peterCacc);
	    
	    Customer customer3 = new Customer("Steve", "Rogers");
	    SavingsAccount steveSacc = new SavingsAccount(2000, 0.03);
	    CheckingAccount steveCacc = new CheckingAccount(1000, steveSacc);
		customer3.addAccount(steveSacc);
		customer3.addAccount(steveCacc);
	    
	    
	    bank.addCustomer(customer1);
	    bank.addCustomer(customer2);
	    bank.addCustomer(customer3);
	    
	    System.out.println("Steve의 SavingsAccount " + steveSacc);
	    System.out.println("Steve의 CheckingAccount " + steveCacc);
	    
	    System.out.println("\n새로운 withdraw 메소드 실험(1400원 인출)");
	    steveCacc.withdraw(1400);
	    System.out.println("Steve의 SavingsAccount " + steveSacc);
	    System.out.println("Steve의 CheckingAccount " + steveCacc);
	    
	    System.out.print("\n");
	    
	    for(int cus_index = 1; cus_index <= bank.getNumberOfCustomers(); cus_index++) {
	    	System.out.println(bank.getCustomer(cus_index));
	    	for(int acc_index = 1; acc_index <= bank.getCustomer(cus_index).getNumOfAccounts(); acc_index++) {
	    		if (bank.getCustomer(cus_index).getAccount(acc_index) instanceof CheckingAccount)
	    			System.out.print("계좌 종류: CheckingAccount, ");
	    		
	    		if (bank.getCustomer(cus_index).getAccount(acc_index) instanceof SavingsAccount)
	    			System.out.print("계좌 종류: SavingsAccount, ");
	    		System.out.println(bank.getCustomer(cus_index).getAccount(acc_index));
	    	}
	    	
	    	System.out.print("\n");
	    } 
	    
	    System.out.println("10개월 후 잔액");
	    
	    for(int cus_index = 1; cus_index <= bank.getNumberOfCustomers(); cus_index++) {
	    	System.out.println(bank.getCustomer(cus_index));
	    	for(int acc_index = 1; acc_index <= bank.getCustomer(cus_index).getNumOfAccounts(); acc_index++) {
	    		if (bank.getCustomer(cus_index).getAccount(acc_index) instanceof CheckingAccount)
	    			System.out.print("계좌 종류: CheckingAccount, ");
	    		
	    		if (bank.getCustomer(cus_index).getAccount(acc_index) instanceof SavingsAccount) {
	    			SavingsAccount sa = (SavingsAccount)bank.getCustomer(cus_index).getAccount(acc_index);
	    			sa.updateBalance(10);
	    			System.out.print("계좌 종류: SavingsAccount, ");
	    		}
	    		
	    		System.out.println(bank.getCustomer(cus_index).getAccount(acc_index));
	    		System.out.print("\n");
	    	}
	    } 	    

		}

}
