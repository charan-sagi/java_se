package oop1;

public class SavingsAccount {
	private int acno;
	private String holderName;
	private double balance;
	private static double minBalance = 1000;
	
	public SavingsAccount(int acno, String holderName, double balance) {
		this.acno = acno;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public static void setMinBalance(double minBalance) {
		SavingsAccount.minBalance = minBalance;
	}
	
	public static double getMinBalance() {
		return SavingsAccount.minBalance;
	}
	
	public SavingsAccount(int acno, String holderName) {
		this(acno, holderName, 0);
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (this.balance - amount >= SavingsAccount.minBalance) {
			this.balance -= amount;
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
}
