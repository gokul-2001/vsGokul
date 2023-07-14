package coreAssignment2;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	
public BankAccount(int accountNumber, double balance, String customerName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", customerName=" + customerName
				+ "]";
	}
	

}
