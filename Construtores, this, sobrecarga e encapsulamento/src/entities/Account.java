package entities;

public class Account {

	private int number;
	private String name;
	private double balance;
	
	public Account() {
	}
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
		
	}

	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double balance) {
	   this.balance+=balance;
	}
	
	public void withdraw(double balance) {
		this.balance-=balance-5;
	}
	
	public String toString() {
		return "Account data: "
				+"Account "+number
				+", Holder: "+name
				+", Balance: $ "
				+balance;
		
	}
}
